package Project;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Aaron");
        names.add("JOhny");
        names.add("Dhoni");
        names.add("Madhavan");
        

        ListIterator<String> i= names.listIterator(names.size()); /// need for reversing through the iteration

        while(i.hasPrevious()){
            System.out.println(i.previous());
        }
       // System.out.println(names);
    }
}