import java.util.*;

class Voting {
    public static void main(String[] args) {
        System.out.println("Enter Your Age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }
    }
}