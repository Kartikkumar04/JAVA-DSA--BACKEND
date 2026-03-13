import java.util.*;
public class Equal {
    static void main(String[] args) {
        System.out.print("a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }
        else if(a > b){
                System.out.print("A is greater than B");
            }
        else{
            System.out.println("A is lesser");

        }
    }
}
