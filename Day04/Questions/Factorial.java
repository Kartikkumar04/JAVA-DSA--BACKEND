package Questions;

import java.util.Scanner;

public class Factorial {

    public static void calFactorial(int n) {
        if(n<0){
            System.out.print(n+" "+"is Invalid");
            return;
        }
    int Factorial  = 1;
        for(int i=n; i>=1; i--){
    Factorial = Factorial * i;
        }
        System.out.println(Factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calFactorial(n);
    }

}

