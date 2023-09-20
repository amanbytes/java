import java.util.Scanner;
public class array_reverse{
    public static void main(String args[]){
        int n;
        System.out.print("Enter the size of the array -> ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements -> ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("Array in reverse order -> ");
        for(int i=n-1;i>=0;i--)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}