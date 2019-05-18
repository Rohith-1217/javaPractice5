import java.util.Comparator;

//receives the input from Maintest java class

public class StudentSorter implements Comparator<Student> {
    @Override
    //compares the data received

    public int compare(Student o1, Student o2) {
        if (o1.getAge() < o2.getAge()) {
            return 1;
        } else if (o1.getAge() > o2.getAge()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) < 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) > 0) {
                return -1;
            } else {
                if (o1.getId() < o2.getId()) {
                    return 1;
                } else if (o1.getId() > o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
