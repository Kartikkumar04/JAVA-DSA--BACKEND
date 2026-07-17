package PRACTICE;
import java.util.*;
public class Evnod {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to find out the number is even or odd:");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("The number " +n +"is even");
        } else{
            System.out.println("The number " +n +"is odd");
        }
    }
}
