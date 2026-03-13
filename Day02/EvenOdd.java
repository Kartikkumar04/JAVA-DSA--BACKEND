
import java.util.*;
public class EvenOdd {
    static void main(String[] args) {
        System.out.println("Enter a no:");
        Scanner sc =  new Scanner(System.in);
        int no = sc.nextInt();

        if(no % 2 ==0 ) {
            System.out.print("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }
    }
}
