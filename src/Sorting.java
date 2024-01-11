import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sorting implements Comparator<Student> {
    Scanner scanner = new Scanner(System.in);
    int yourChoice = scanner.nextInt();

    @Override
    public int compare(Student o1, Student o2) {

        if (yourChoice==1){
            return 0;
        }
        if (yourChoice==2){
            return o2.getMissedLessons()-o1.getMissedLessons();
        }
        if (yourChoice==3){
            return o1.getName().length()-o2.getName().length();
        }
        if (yourChoice==4){
            if (o1.isJobcenter() == !o2.isJobcenter()){
                return o2.getMissedLessons()-o1.getMissedLessons();
            }
            if (o1.isJobcenter() == o2.isJobcenter()){
                return o1.getMissedLessons()-o2.getMissedLessons();
            }
        }
        return 0;
    }
}
