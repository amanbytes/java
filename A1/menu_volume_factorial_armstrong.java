import java.util.Scanner;

public class menu_volume_factorial_armstrong {
    static void volume(float height,float radius){
        System.out.println("Volume is "+String.format("%.2f",Math.PI*(radius*radius)*height)+"\n");
    }

    static void factorial(int num){
        int result = 1;
        for(int i=1;i<=num;i++)
        result *= i;
        System.out.println("Factorial of "+num+" is "+result+"\n");
    }

    static void armstrong(int num){
        int orginal_number = num;
        int digits = 0;
        int sum=0;
        while (num!=0){
            digits++;
            num/=10;
        }
        num = orginal_number;
        while(num!=0){
            int digit = num%10;
            sum+=Math.pow(digit,digits);
            num/=10;
        }
        if(sum==orginal_number)
        System.out.println("Given number is Armstrong!!\n");
        else
        System.out.println("Given number is not Armstrong!!\n");
    }

    static float scan(Scanner sc){
        Boolean valid = false;
        float num=0;;
        while(!valid)
        if(sc.hasNextInt() || sc.hasNextFloat()){
            if(sc.hasNextInt())
            num = sc.nextInt();
            else
            num = sc.nextFloat();
            valid=true;
        }
        else{
        System.out.print("Invalid Input!! Try again -> ");
        sc.nextLine();
        }
        return num;
    }
    public static void main(String args[]){
        boolean state=true;
        Scanner sc = new Scanner(System.in);
        while(state){
            System.out.println("Menu Driven Program\n1. Calculate the Volume Of Cylinder");
            System.out.println("2. Find the factorial\n3. Check Armstrong\n4. Exit");
            System.out.print("Enter your choice -> ");
            int choice = (int)scan(sc);
            switch(choice){
                case 1 : 
                        System.out.print("Cylinder Volume Calculator\nEnter Radius -> ");
                        float radius=scan(sc);
                        System.out.print("Enter Height -> ");
                        float height=scan(sc);
                        volume(height,radius);
                        break;
                case 2 :
                        System.out.print("Factorial Calculator\nEnter Number: ");
                        int num=(int)scan(sc);
                        factorial(num);
                        break;
                case 3 :
                        System.out.print("Armstrong Check\nEnter Number: ");
                        int arm_num=(int)scan(sc);
                        armstrong(arm_num);
                        break;
                case 4 :
                        state=false;
                        break;
                default :
                        System.out.println("\nInvalid Choice\n");
            }   
        }
        sc.close();
    }
}