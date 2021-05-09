package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(String name) {
        //  нагуглил такой кусочек кода, для выставления значения от 2-5
        int min = 2;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int intPoint = random.nextInt(diff + 1);
        intPoint += min;

        String strPoint = null;

        switch (intPoint) {
            case 5:
                strPoint = "отлично";
                break;
            case 4:
                strPoint = "хорошо";
                break;
            case 3:
                strPoint = "удовлетворительно";
                break;
            case 2:
                strPoint = "неудовлетворительно";
        }

        System.out.println("\nПреподаватель " + getName()
                + " оценила студента с именем "
                + name + " по предмету "
                + getSubject() + " на оценку "
                + strPoint + ".");
    }
}