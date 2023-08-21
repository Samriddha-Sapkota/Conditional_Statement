import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        float marksMath, marksScience, marksEnglish, Percentage;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the marks obtained in Maths. ");
        marksMath = sn.nextFloat();
        if (marksMath <0){
            System.out.println("The marks cannot be in negative.");
            return;
        }
        System.out.println("Enter the marks obtained in English. ");
        marksEnglish = sn.nextFloat();
        if (marksEnglish <0){
            System.out.println("The marks cannot be in negative.");
            return;
        }
        System.out.println("Enter the marks obtained in Science. ");
        marksScience = sn.nextFloat();
        if (marksScience <0){
            System.out.println("The marks cannot be in negative.");
            return;
        }
        if (marksMath < 30 || marksEnglish < 30|| marksScience <30) {
            System.out.println("The students marks is NG, babu padna jau timi");
            return;
        }
        Percentage = ((marksMath + marksEnglish + marksScience)/300) * 100;
        if (Percentage > 90 & Percentage < 100){
            System.out.println("The student has scored A+, la badai cha");
        }
          else if(Percentage > 80 & Percentage < 90){
            System.out.println("The student has scored A, la badai cha");
        }
          else if(Percentage > 70 & Percentage < 80){
            System.out.println("The student has scored B+, la thikai cha");
        }
          else if (Percentage > 60 & Percentage < 70){
            System.out.println("The student has scored B, la khatam cha ");
        }
          else if(Percentage > 50 & Percentage < 60){
            System.out.println("The student has scored C+, babu padna jau");
        }
    }
}
