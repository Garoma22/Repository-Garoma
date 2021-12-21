package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("МарьВанна", "биология");

        Student student = new Student("Вовочка");

        student.setName1("Петя");

        teacher.evaluate(student);
    }
}
