
package linkedlist;
import java.util.LinkedList;
public class Linkedlist {


    public static void main(String[] args) {
        LinkedList <String> animals = new LinkedList<>();
        
        //insertion
        animals.add("Monkey");
        animals.addFirst("Donkey");
        animals.addLast("Elephant");
        animals.add(1, "Lion");
        
        System.out.println("Linked List Original: " + animals);
         System.out.println(animals.size());

         //serching
         if (animals.contains("Lion")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
  boolean containslion = animals.contains("Lion");
        System.out.println(containslion);

        }
}
