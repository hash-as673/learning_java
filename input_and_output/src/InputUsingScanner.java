import java.util.Scanner;

public class InputUsingScanner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(i);
        System.out.println(s);
        sc.close();
    }
}