import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Main class
public class Maintest {
    public static void main(String[] args) {
        //Storing student data in List
        List<Student> students=new ArrayList<Student>();
        Student s1=new Student(1,"aa",22);
        students.add(s1);
        Student s2=new Student(2,"bb",21);
        students.add(s2);
        Student s3=new Student (3,"aa",21);
        students.add(s3);
        Student s4=new Student(4,"aa",21);
        students.add(s4);
        Student s5=new Student(5,"dd",24);
        students.add(s5);
        Collections.sort(students,new StudentSorter());

        //prints output in descending order
        Iterator ite=students.iterator();
        while(ite.hasNext()){
            Student student=(Student) ite.next();
            System.out.println(student.getName()+"\t"+student.getAge()+"\t"+student.getId());
        }
    }
}


