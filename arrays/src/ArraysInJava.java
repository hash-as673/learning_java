import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            System.out.println("Enter value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The values in the array are: ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
