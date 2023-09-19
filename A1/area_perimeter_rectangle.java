import java.util.Scanner;

public class area_perimeter_rectangle {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Area & Perimeter calculator\nEnter Length: ");
        float length = sc.nextFloat();
        System.out.print("Enter Breadth: ");
        float breadth = sc.nextFloat();
        float area = length*breadth;
        float perimeter = 2*(length*breadth);
        System.out.println("Area is: "+area);
        System.out.println("Permieteris : "+perimeter);
        sc.close();

    }

}