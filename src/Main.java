import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("Jack",4,false));
        student.add(new Student("Nikolay",7,true));
        student.add(new Student("Ann",1,false));
        student.add(new Student("Nicole",3,true));
        student.add(new Student("Maria",3,false));
        student.add(new Student("Raf",3,true));

        PrintSelection.print();

        Collections.sort(student,new Sorting());

        System.out.println(student);

    }
}