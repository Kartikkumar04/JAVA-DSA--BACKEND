package Exercise;
import java.util.*;
public class Greater {
    public static int greatest(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b =sc.nextInt();

        System.out.println("Greater is:"+greatest(a,b));
    }
}
