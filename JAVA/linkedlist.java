import java.util.*;

// add,and remove->linkedlist
// searching->aaray
public class linkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add('A');
        list.add("Hello");
        list.add('A');
        System.out.println(list);
        System.err.println("-----------------------------------------------");
        // search
        System.err.println("---------------------SEARCH--------------------------");
        System.out.println(list.contains("Hello"));
        System.out.println(list.indexOf("Hello"));
        System.err.println("------------------GET-INDEX-----------------------------");
        // accessing the element
        // 1->get index;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.err.println("------------------FOR-EACH-----------------------------");
        // 2->for each
        for (Object o : list) {
            System.out.println(o);
        }
        System.err.println("-----------------ITERATOR------------------------------");
        // 3->iterator
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.err.println("---------------------REMOVING ELEMENTS----(REMOVE)----------------------");
        System.out.println(list.remove(2));
        System.out.println(list);
        System.err.println("---------------------REMOVING ELEMENTS----(REMOVE ALL)----------------------");
        System.out.println(list.removeAll(list));
        System.out.println(list);
        System.err.println("---------------------REMOVING ELEMENTS----(RETAIN ALL)----------------------");
        System.out.println(list.retainAll(list));
        System.out.println(list);
        System.err.println("---------------------REMOVING ELEMENTS----(CLEAR)----------------------");
        list.clear();
        System.out.println(list);

    }
}
