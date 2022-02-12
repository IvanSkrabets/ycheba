import java.util.Scanner;
public class TaskFive {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = enter.nextInt();
        System.out.print("Введите второе число: ");
        int b = enter.nextInt();
        System.out.print("Введите третье число: ");
        int c = enter.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("3 положительных числа и 0 отрицаельных");
        } else {
            if ((a > 0 && b > 0 && c < 0) || (a < 0 && b > 0 && c > 0) || (a > 0 && b < 0 && c > 0)) {
                System.out.println("2 положительных числа и 1 отрицательное");
            }else {
                if ((a > 0 && b < 0 && c < 0) || (a < 0 && b > 0 && c < 0) || (a < 0 && b < 0 && c > 0)) {
                    System.out.println("1 положительное число и 2 отрицательных");
                }else {
                    System.out.println("все отрицательные числа");
                }
            }
        }
    }
}
