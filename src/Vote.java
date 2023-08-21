import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int userAge;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter your age! ");
        userAge = sn.nextInt();

        if (userAge >= 18){
            System.out.println("The user can vote!");
        }
        else {
            System.out.println("The user can't vote!");
        }
    }
}
