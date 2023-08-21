import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        int userInput;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter your number! ");
        userInput = sn.nextInt();

        if(userInput % 3 ==0){
            System.out.println("Yes");
        }
    }
}
