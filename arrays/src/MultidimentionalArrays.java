import java.util.Scanner;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        for (int k = 0; k < i ; k++){
            for (int l = 0 ; l < j ; l++){
                System.out.print("Enter value for index [" + k + "][" + l + "]: ");
                int value = sc.nextInt();
                System.out.print(value + " ");
            }
        }
        System.out.println();
        System.out.println("The values in the multidimensional array are: ");
        for (int k = 0; k < i ; k++){
            for (int l = 0 ; l < j ; l++){
                System.out.print("[" + k + "][" + l + "] ");
            }
            System.out.println();
        }
    }

}
