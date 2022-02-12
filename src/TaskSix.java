import com.sun.source.tree.IfTree;

import java.util.Scanner;
public class TaskSix {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = enter.nextInt();
        System.out.print("Введите второе число: ");
        int b = enter.nextInt();
        if (a > b ) {
            System.out.println("Большее число : " + a);
        }else {
            System.out.println("Большее число : " + b);
        }

    }
}
