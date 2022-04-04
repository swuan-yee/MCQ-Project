package MCQProject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuestionAndAnswer {
    BufferedReader br = null;
    String line = "";
    String commaCsv = ",";
    public static double trueAns = 0.0;
    public static double falseAns = 0.0;
    Scanner sc = new Scanner(System.in);

    public void MCQ(int choice) throws IOException {
        switch (choice) {
            //file location for MCQ sets
            case 1: {
                try {
                    {
                        String fileLocation = "C:\\\\Users\\\\Victor Swuan Yee Lin\\\\IdeaProjects\\\\MCQ_Demo\\\\src\\\\csv\\\\Java.csv";

                        br = new BufferedReader(new FileReader(fileLocation));
                        //BufferedReader is reading csv file and save it into line String variable
                        //This process is iterating end of csv files (MCQ Questions)
                        while ((line = br.readLine()) != null) {
                            //Reading csv file using BufferedReader

                            String[] QueAndAns = line.split(commaCsv);
                            //Showing MCQ Question to the user in console screen

                            System.out.println("Please answer with Capital Letter !!! \n");
                            System.out.println(QueAndAns[0] + "\n" + QueAndAns[1] + "\n" + QueAndAns[2] + "\n" + QueAndAns[3] + "\n" + QueAndAns[4]);
                            System.out.print("Type your Answer Here: ");
                            String Ans = sc.next(); //Requesting answer from the user
                            if (QueAndAns[5].equals(Ans)) {//Testing user answer is correct or not
                                System.out.println("Your answer is correct.");
                                System.out.println("*******************************************************");
                                trueAns++;
                            } else {
                                System.out.println("Your answer is Wrong !!!");
                                System.out.println("*******************************************************");
                                falseAns++;

                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    br.close();
                }
            }
            break;
            case 2 : {
                try {
                    {
                        String fileLocation = "C:\\\\Users\\\\Victor Swuan Yee Lin\\\\IdeaProjects\\\\MCQ_Demo\\\\src\\\\csv\\\\HTML.csv";

                        br = new BufferedReader(new FileReader(fileLocation));
                        //BufferedReader is reading csv file and save it into line String variable
                        //This process is iterating end of csv files (MCQ Questions)
                        while ((line = br.readLine()) != null) {
                            //Reading csv file using BufferedReader

                            String[] QueAndAns = line.split(commaCsv);
                            //Showing MCQ Question to the user in console screen

                            System.out.println("Please answer with Capital Letter !!! \n");
                            System.out.println(QueAndAns[0] + "\n" + QueAndAns[1] + "\n" + QueAndAns[2] + "\n" + QueAndAns[3] + "\n" + QueAndAns[4]);
                            System.out.print("Type your Answer Here: ");
                            String Ans = sc.next(); //Requesting answer from the user
                            if (QueAndAns[5].equals(Ans)) {//Testing user answer is correct or not
                                System.out.println("Your answer is correct.");
                                System.out.println("*******************************************************");
                                trueAns++;
                            } else {
                                System.out.println("Your answer is Wrong !!!");
                                System.out.println("*******************************************************");
                                falseAns++;

                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    br.close();
                }
            }
            break;
            case 3 : {
                try {
                    {
                        String fileLocation = "C:\\\\Users\\\\Victor Swuan Yee Lin\\\\IdeaProjects\\\\MCQ_Demo\\\\src\\\\csv\\\\PHP.csv";

                        br = new BufferedReader(new FileReader(fileLocation));
                        //BufferedReader is reading csv file and save it into line String variable
                        //This process is iterating end of csv files (MCQ Questions)
                        while ((line = br.readLine()) != null) {
                            //Reading csv file using BufferedReader

                            String[] QueAndAns = line.split(commaCsv);
                            //Showing MCQ Question to the user in console screen

                            System.out.println("Please answer with Capital Letter !!! \n");
                            System.out.println(QueAndAns[0] + "\n" + QueAndAns[1] + "\n" + QueAndAns[2] + "\n" + QueAndAns[3] + "\n" + QueAndAns[4]);
                            System.out.print("Type your Answer Here: ");
                            String Ans = sc.next(); //Requesting answer from the user
                            if (QueAndAns[5].equals(Ans)) {//Testing user answer is correct or not
                                System.out.println("Your answer is correct.");
                                System.out.println("*******************************************************");
                                trueAns++;
                            } else {
                                System.out.println("Your answer is Wrong !!!");
                                System.out.println("*******************************************************");
                                falseAns++;

                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    br.close();
                }
            }

        }
    }
    //restart the user score when the user re-answer the MCQ questions
    public void reset(){
        trueAns = 0.0;
        falseAns = 0.0;
    }
}
