import java.util.Scanner;

public class CWH_ch4_PracticeSet {
    public static void main(String[] args) {
        //Problem 1
//        int a = 10;
//        if (a == 11){
//            System.out.println("I am 11");
//        }else {
//            System.out.println("I am not 11");
//        }
        //Problem 2
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your marks in Mathematics: ");
        int maths = s1.nextInt();
        System.out.print("Enter your marks in Physics: ");
        int physics = s1.nextInt();
        System.out.print("Enter your marks in Chemistry: ");
        int chemistry = s1.nextInt();
        float avg = (maths + physics + chemistry) / 3.0f;
        if (avg>=40 && physics >= 33 && maths >= 33 && chemistry >=33){
            System.out.println("You have successfully passed the examination!");
        }else {
            System.out.println("You failed the exam!");
        }
    }
}
