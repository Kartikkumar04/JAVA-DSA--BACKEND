import java.util.*;
public class Functions{
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = obj.next();

        printMyName(name);
    }
}