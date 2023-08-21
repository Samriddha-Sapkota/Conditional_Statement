import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int User_Input;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter any number! ");
        User_Input = sn.nextInt();

        if(User_Input % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}