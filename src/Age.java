import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int userInput;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter your age! ");
        userInput = sn.nextInt();

        if (userInput == 17){
            System.out.println("Hello");
        }
    }
}
