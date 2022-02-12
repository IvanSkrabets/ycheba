import java.util.Scanner;
public class TaskSeven {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = enter.nextInt();
        int b =  a / 100;
        int c = a - b * 100 ;
        int f =  (c / 10) ;
        int e = c - 10 * f ;
        if ( e == 1 && c != 11) {
            System.out.println(a + " Програмист");
        } else {
            if (e > 1 && e < 5 && c != 12 && c != 13 && c != 14 ){
                System.out.println( a + " Програмиста");
            }else{
                System.out.println( a + " Програмисто");
            }
        }
            }
 }
