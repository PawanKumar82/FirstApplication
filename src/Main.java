import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Dilip","Chintal");
        Student s2 = new Student(2,"Pawan","Bapatla");
        Student s3 = new Student(3,"Kumar","Repalla");
        Student s4 = new Student(4,"Purnima","Kukatpalli");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println(students);
    }
}