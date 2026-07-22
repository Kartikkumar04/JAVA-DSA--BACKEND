package Exercise;

import java.util.Scanner;

public class Circle {
    public static double cF(double r){
        return 2* Math.PI*r;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        double r=sc.nextDouble();

        System.out.println("CF="+cF(r));
    }
}
