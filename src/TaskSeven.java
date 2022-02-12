import java.util.Scanner;
public class TaskSeven {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите число: ");
        double a = enter.nextDouble();
        double b = (int) (a / 100);
        double c = a - b * 100 ;
        double f = (int) (c / 10) ;
        double e = c - 10 * f ;
        if ( e == 1 && c != 11) {
            System.out.println((int )a + " Програмист");
        } else {
            if (e > 1 && e < 5 && c != 12 && c != 13 && c != 14 ){
                System.out.println((int) a + " Програмиста");
            }else{
                System.out.println((int) a + " Програмистов");
            }
        }
            }
 }
