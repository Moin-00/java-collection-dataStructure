import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Students implements Comparable<Students>{
    String name;
    int id;

    public Students(String name , int id ){
        this.name= name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students student = (Students) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public int compareTo(Students o) {
        return 0;
    }
}
public class ComparableExample {
    public static void main(String[] args) {

//        List<Students> studentList = new ArrayList<>();
//        studentList.add(new Students("Moin",1));
//        studentList.add(new Students("Vikram",6));
//        studentList.add(new Students("Aditi",7));
//        studentList.add(new Students("Prem",4));
//        System.out.println("------");
//        System.out.println("Elements Before sorting ");
//        studentList.forEach(System.out::println);
//        System.out.println("------");
//        System.out.println("Elements after sorting based on names ");
//        Collections.sort(studentList);
//        studentList.forEach(System.out::println);



        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students("Vikram",100));
        studentList.add(new Students("Karan",400));
        studentList.add(new Students("Moin",500));
        studentList.add(new Students("Pratik",200));
        studentList.add(new Students("Komal",300));


        List<String> s = new ArrayList<>();
        s.add("M");
        s.add("A");
        s.add("V");

        System.out.println(s);
        Collections.sort(s);
        System.out.println(s);
        s.forEach(System.out::println);

        /*
        Collections.sort() method does not work when there
        is more than one parameter to compare
         */

//        System.out.println("before sorting");
//        studentList.forEach(System.out::println);
//        Collections.sort(studentList);
//        System.out.println("after sorting");
//        studentList.forEach(System.out::println);
    }
    
}
