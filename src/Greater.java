import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        int userInput1, userInput2;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the first number! ");
        userInput1 = sn.nextInt();

        System.out.println("Enter the second number! ");
        userInput2 = sn.nextInt();

        if (userInput1 > userInput2){
            System.out.println(userInput1 + " is greater than " + userInput2);
        }
        else if (userInput1 == userInput2){
            System.out.println("The numbers are equal");
        }
        else{
            System.out.println(userInput1 + " is smaller than " + userInput2);
        }
    }
}
