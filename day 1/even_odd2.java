import java.util.Scanner;
public class even_odd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        if (x/2*2 == x) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }
}