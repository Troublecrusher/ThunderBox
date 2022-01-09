package day6;

import java.util.Random;

public class Teacher {
    private final String teacherName;
    private final String subject;

    Random random = new Random();

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public String evaluate(Student student) {
        String evaluation;
        int randomNum = (random.nextInt(4) + 2);          //генерируется рандомное число в диапазоне от 2 до 5

        switch (randomNum) {
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            default:
                evaluation = "отлично";
        }

        return "Преподаватель " + this.teacherName + " оценил студента с именем " + student.getName() +
                " по предмету " + subject + " на оценку " + evaluation + ".";
    }
}
