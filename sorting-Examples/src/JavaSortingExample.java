import java.util.*;

public class JavaSortingExample {
    public static void main(String[] args) {
        String [] fruits = new String[5];
        fruits[0]="Apple";
        fruits[1]="Mango";
        fruits[2]="Guava";
        fruits[3]="Orange";
        fruits[4]="Grapes";

        System.out.println("Elements before sorting");
        for ( String n : fruits){
            System.out.println(n);
        }
        System.out.println("---------------------");
        System.out.println("Elements after sorting");
        Arrays.sort(fruits);
        for ( String n : fruits){
            System.out.println(n);
        }
        System.out.println("---------------------");
        System.out.println("List ");
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("A");
        names.add("aA");
        names.add("MA");
        names.add("Ma");
        names.forEach(System.out::println);
        System.out.println("---------------------");
        Collections.sort(names);
        System.out.println("Elements after sorting");
        System.out.println("---------------------");
        names.forEach(System.out::println);





    }
}
