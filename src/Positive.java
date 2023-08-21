import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        int User_Input;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter a number! ");
        User_Input = sn.nextInt();

        if(User_Input > 0){
            System.out.println("The number is positive");
        }
        else if (User_Input == 0){
            System.out.println("The number is 0");
        }
        else {
            System.out.println("The number is negative! ");
        }
    }
}