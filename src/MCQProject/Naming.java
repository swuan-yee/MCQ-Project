package MCQProject;

public class Naming {
    private String userName;
    private int choosing;

    public void setChoice(int choice) {
        this.choosing = choice;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public int getChoice() {
        return choosing;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + userName + '\'' +
                ", choice=" + choosing +
                '}';
    }


}