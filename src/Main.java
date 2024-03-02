import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {    int res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number whose multiplication is to be find");
        int vari = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            res =vari*i;
            System.out.println(res );
        }
    }
}