package PRACTICE;
import java.util.*;
public class great{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a =sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();


        if(a==b){
            System.out.println("A is B is Equal.");
        } else if (a>b){
            System.out.println("A is Greater than B.");
        } else{
            System.out.println("A is Less than B.");
        }
    }
}