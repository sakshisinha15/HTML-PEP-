import java.util.HashSet;
import java.util.*;

public class hashsetcoll {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(10);
        set.add('A');
        set.add("Hello");
        set.add(20);
        set.add(20);
        set.add(null);
        System.out.println(set);

        System.err.println("-----------------------------------------------");
        // search
        System.err.println("---------------------SEARCH--------------------------");
        System.out.println(set.contains("Hello"));
        System.err.println("------------------FOR-EACH-----------------------------");
        // 2->for each
        for (Object o : set) {
            System.out.println(o);
        }
        System.err.println("-----------------ITERATOR------------------------------");
        // 3->iterator
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.err.println("---------------------REMOVING ELEMENTS----(REMOVE)----------------------");
        System.out.println(set.remove(2));
        System.out.println(set);
        System.err.println("---------------------REMOVING ELEMENTS----(REMOVE ALL)----------------------");
        System.out.println(set.removeAll(set));
        System.out.println(set);
        System.err.println("---------------------REMOVING ELEMENTS----(RETAIN ALL)----------------------");
        System.out.println(set.retainAll(set));
        System.out.println(set);
        System.err.println("---------------------REMOVING ELEMENTS----(CLEAR)----------------------");
        set.clear();
        System.out.println(set);

    }
}
