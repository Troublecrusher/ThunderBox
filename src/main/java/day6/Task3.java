package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Михал Иваныч", "история");
        Student student = new Student("Игнат");

        System.out.println(teacher.evaluate(student));
    }
}
