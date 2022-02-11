    import java.util.Scanner;

public class ZadachaOdin {
    public static void main(String[] args) {
        int a = 0;
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите число:");
        int b = enter.nextInt();
        if (b < 0) {
            System.out.print("число отрицательное");
        } else {
            System.out.print("число положительное");
        }
        while (b > 0 || b < 0) {
            b = b / 10;
            a++;
        }
        System.out.print(" и количество цифр: " + a);
    }
}
