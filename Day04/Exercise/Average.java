import java.util.*;
public class Average{
    public static double average(int a, int b , int c){
        return (a + b + c)/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second number: ");
        int b = sc.nextInt();

        System.out.print("Enter Third number: ");
        int c = sc.nextInt();

       System.out.println("Average="+ average(a,b,c));
    }
}