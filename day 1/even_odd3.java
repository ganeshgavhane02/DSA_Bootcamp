import java.util.Scanner;
public class even_odd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        while(x > 1){
            x = x-2;
            if (x == 0) {
                System.out.println(x + " is even.");
                break;
            } else if (x == 1) {
                System.out.println(x + " is odd.");
                break;
            }
        }
    }
}