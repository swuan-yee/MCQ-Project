package MCQProject;

public class ResultPercentage extends QuestionAndAnswer {
    double percentage;

    //output of user score end of the MCQ 
    public void outputResult(){
        percentage = (trueAns /10)*100;
        System.out.println("You answered "+ trueAns + " Questions Right, " + falseAns + " Questions are Wrong for Total of 10 Questions.");
        System.out.println("Congratulations!!! Your Score is "+ percentage +"%");
    }

}

