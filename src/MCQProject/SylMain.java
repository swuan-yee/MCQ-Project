package MCQProject;

import java.io.IOException;
import java.util.Scanner;

public class SylMain {
    public static void main(String[] args) throws IOException {

        greeting();//Calling to welcome method

        //calling userInput name method
        Naming s = new Naming();
        s.setName(userInput());


    do {
        MCQType();
        s.setChoice(choiceMCQType());//calling choiceMCQType methods
        QuestionAndAnswer mc = new QuestionAndAnswer();//calling QuestionAndAnswer
        mc.reset();// to restart the scoring program
        mc.MCQ(s.getChoice());

        System.out.println("Learner name: " + s.getName());

        ResultPercentage usc = new ResultPercentage();
        usc.outputResult();

        reUse();
        s.setChoice(exitToChoose());
        if (s.getChoice()==2){
            Exit();
            break;
        }
    } while (s.getChoice() == 1) ;


    }
    //choosing answer again or exit when the user end to answer the MCQ questions
    public static void reUse(){
        System.out.println(" ");
        System.out.println("Do you want to try another question?");
        System.out.println("1. Answer Again.");
        System.out.println("2. Exit.");
    }
    //thank you message
    public static void Exit(){
        System.out.println("*******************************************************");
        System.out.println(" ");
        System.out.println("Thank you for your answering our MCQ Questions.");
        System.out.println(" ");
        System.out.println("*******************************************************");

    }

    //welcome message at the start of the program
    public static void greeting(){
        System.out.println(" ");
        System.out.println("Welcome to our 'ABC Learning Center' ");
        System.out.println("*******************************************************");
        System.out.print("Please enter your name: ");
    }

    //Scanner for user name input
    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        return Name;
    }
    //show the questions set name
    public static void MCQType() {
        System.out.println("Please kindly choose MCQ Question Set.");
        System.out.println("\nChoose your Multiple Choice Question Set. The Options are:");
        System.out.println("1. Java");
        System.out.println("2. HTML");
        System.out.println("3. PHP");
    }

    //user can choose MCQ type here like 1 or 2 or 3 (user can only type number 1 or 2 or 3)
    public static int choiceMCQType(){
        System.out.print("Enter MCQ Question Set: ");
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("*******************************************************");
        return choice;


    }
    /*//Divide and Conquer
    public static void thirdQ(){
        System.out.println();
        System.out.println("This is the third question");
        System.out.println();
        System.out.println();

        System.out.println("Which of the following for loop declaration is not valid?");
        System.out.println("1. for ( int i = 99; i >= 0; i / 9 )");
        System.out.println("2. for ( int i = 7; i <= 77; i += 7 )");
        System.out.println("3. for ( int i = 20; i >= 2; - -i )");
        System.out.println("4. for ( int i = 2; i <= 20; i = 2* i )");
    }*/

    //scanner for choose exit or answer again at end of the program
    public static int exitToChoose() {
        System.out.print("Choose One: ");
        Scanner sc=new Scanner(System.in);
        int choose=sc.nextInt();
        return choose;
    }

}
