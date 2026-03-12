package Day01.PRACTICE;
import java.util.*;
public class SI {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        float SI = (p * r * t) / 100;
        System.out.print("Simple Interest is:" + SI);

    }
}
