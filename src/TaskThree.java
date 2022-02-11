import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = enter.nextInt();
        if (a > 0) {
            System.out.println(a+1);
        }else {
            if (a==0){
                System.out.println(10);
            }else {
                System.out.println(a-2);
            }
        }
    }
}
