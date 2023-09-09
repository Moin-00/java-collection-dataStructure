import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        /*
        Set is an interface and HashSet is a Class that implements Set
        Set does not allow Duplicate characters
        We can use either to declare an Set as the method in set is overridden in Hashset and we are
        creating teh object for HashSet for either object

        The order of Elements Insertion is not Retained in HashSet
        */

//

//        Set<String> fruitnames = new HashSet<>();
        HashSet<String> fruitnames = new HashSet<>();

        fruitnames.add("Mango");
        fruitnames.add("Apple");
        fruitnames.add("Orange");

        System.out.println("------------------------");

        if(fruitnames.isEmpty()){
            System.out.println(" Set is empty");
        }else{
            System.out.println(" Set is not empty");
        }
        System.out.println("------------------------");

        System.out.println("Size : "+fruitnames.size());

        System.out.println("------------------------");

        for(String fruits : fruitnames){
            System.out.println("Name = "+ fruits );
        }
        System.out.println("------------------------");
//        After Adding Duplicate Value in Set
        System.out.println("After Adding Duplicate Value in Set");

        fruitnames.add("Mango");

        for(String fruits : fruitnames){
            System.out.println("Name = "+ fruits );
        }
        fruitnames.remove("Apple");

        System.out.println("------------------------");
        for(String fruits : fruitnames){
            System.out.println("Name = "+ fruits );
        }
        System.out.println("------------------------");




    }
}