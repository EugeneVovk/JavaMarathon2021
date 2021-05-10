package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

//    public void evaluate(String name) {
//        //  нагуглил такой кусочек кода, для выставления значения от 2-5, http://java-online.ru/java-random.xhtml
//        int min = 2;
//        int max = 5;
//        int diff = max - min;
//        Random random = new Random();
//        int intPoint = random.nextInt(diff + 1);
//        intPoint += min;

    //  в Java мы можем в качестве аргументов указывать наши собственные классы
    //  ...при вызове этого метода в качестве аргумента ему ннужно передать объект класса Student
    public void evaluate(Student student) {
        Random random = new Random();
        // Этот метод генерирует числа от нуля до указанного значения (не включая его)
        // ...следовательно, мы указывает 4 и к этому числу просто прибавляем 2, чтобы получить диапазон от 2 до 5
        int intPoint = random.nextInt(4) + 2;

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

        System.out.println("\nПреподаватель " + this.name
                + " оценила студента с именем "
                + student.getName() + " по предмету "
                + this.subject + " на оценку "
                + strPoint + ".");
    }
}