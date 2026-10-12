import java.util.*;

public class even_odd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();
        if ((x & 0 ) == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }

}