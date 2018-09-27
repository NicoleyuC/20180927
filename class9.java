// 月份與季節
import java.util.Scanner;

public class class9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 12) {
            if (x >= 3 && x <= 5) {
                System.out.println("Spring");
            } else if (x >= 6 && x <= 8) {
                System.out.println("Summer");
            } else if (x >= 9 && x <= 11) {
                System.out.println("Autumn");
            } else {
                System.out.println("Winter");
            }
        }
    }
}