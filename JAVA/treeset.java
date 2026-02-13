import java.util.*;

public class treeset {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(10);
        set.add(5);
        set.add(2);
        set.add(10);
        set.add(20);
        set.add(15);
        System.out.println(set);

        System.out.println("-------------------Treeset----------------------------");
        // search
        System.out.println("---------------------SEARCH--------------------------");
        System.out.println(set.contains(10));
        System.out.println("------------------FOR-EACH-----------------------------");
        // 2->for each
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("-----------------ITERATOR------------------------------");
        // 3->iterator
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("---------------------REMOVING ELEMENTS----(REMOVE)----------------------");
        System.out.println(set.remove(2));
        System.out.println(set);
        // System.out.println("---------------------REMOVING ELEMENTS----(REMOVE
        // ALL)----------------------");
        // System.out.println(set.removeAll(set));
        // System.out.println(set);
        System.out.println("---------------------REMOVING ELEMENTS----(RETAIN ALL)----------------------");
        System.out.println(set.retainAll(set));
        System.out.println(set);
        System.out.println("---------------------REMOVING ELEMENTS----(CLEAR)----------------------");
        set.clear();
        System.out.println(set);
    }
}
