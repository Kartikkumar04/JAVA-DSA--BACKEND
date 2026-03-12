package Day01;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        System.out.print("Enter Your Name:");
        Scanner sc = new Scanner(System.in);
        String name =  sc.nextLine();
        System.out.println(name);

        System.out.print("Enter Two numbers to find the sum:");
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        int b = c.nextInt();
        System.out.println(a+b);
    }
}
