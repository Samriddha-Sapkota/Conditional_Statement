import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        float userMarks;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the marks! ");
        userMarks = sn.nextFloat();

        if (userMarks > 90){
            System.out.println("The user has got A.");
        }
    }
}
