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
        student.add(new Student("Nicole",19,true));
        student.add(new Student("Maria",11,false));
        student.add(new Student("Raf",14,true));

        PrintSelection.print();

        Collections.sort(student,new Sorting());

        System.out.println(student);

    }
}