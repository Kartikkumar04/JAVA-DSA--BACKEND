import java.util.*;
public class Switch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

//        if(button == 1) {
//            System.out.println("Hello");
//        } else if(button == 2) {
//            System.out.println("Namaste");
//        } else if(button == 3){
//            System.out.println("Bojour");
//        } else{
//            System.out.println("Invalid choice");
//        }
//  SWITCH USED WHEN THERE ARE MULTIPLE IF ELSE STATEMENTS
        switch(button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("Bonjour");
            default:
                System.out.println("Invalid Choice");
        }


    }

}
