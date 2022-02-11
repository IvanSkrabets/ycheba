import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        int a = enter.nextInt();
        System.out.print("Введите сторону b: ");
        int b = enter.nextInt();
        System.out.print("Введите сторону c: ");
        int c = enter.nextInt();
        if (a > b + c || b > c + a || c > a + b ){
            System.out.println("Треугольник не существует");
        }else {
            System.out.println("Треугольник существует");

        }
    }
}
