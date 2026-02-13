import java.util.*;

public class collect {
    public static void main(String[] args) {
        // ArrayList a1 = new ArrayList();

        // // allow duplicate ans nul values
        // a1.add(10);
        // a1.add("Hello");
        // a1.add('A');
        // a1.add(null);
        // a1.add(10);
        // System.out.println(a1);

        // ArrayList a12 = new ArrayList();
        // // allow duplicate ans nul values
        // a12.add(20);
        // a12.add(40);
        // a12.add(30);
        // System.out.println(a1);

        // // addALL
        // a1.addAll(a12);
        // System.out.println(a1);
        // // search inside the collection
        // System.out.println(a1.contains(30));
        // System.out.println(a1.contains(80));
        // // index where the element is present
        // System.out.println(a1.indexOf(30));
        // //sort and delete the element add the custom
        // // create a custo object and add inside the collection
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

        // ArrayList b=new ArrayList()

        // 12 feb(access)
        ArrayList c = new ArrayList();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c);
        System.out.println("-------------------------------------------------");
        // get(index)
        // list heirwachy we use get
        System.out.println(c.get(0));
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
        System.out.println("-------------------------------------------------");
        for (Object o : c) {
            System.out.println(o);
        }
        // interaface iterator method , helper method present in the iterable
        // (Available
        // all for collection)
        // next method->use to get the next element helper method give referrenvce
        // for each ->acces the element from collention
        System.out.println("-------------------------------------------------");
        Iterator i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        /// remove the element from gthe collection (4 method)
        // 1->remove method accepting the object
        // list hierarchy->remove will take the index
        // other hieracrchy it will take the object
        // removeall(accept the collection):-duplicate remove ho jayega from one
        // collection to annother collection)(common element ges remove)
        System.out.println("-------------------------------------------------");
        System.out.println(c.remove(0));
        System.out.println(c);
        System.out.println("-------------------------------------------------");
        ArrayList a12 = new ArrayList();
        a12.add(10);
        a12.add(20);
        a12.add(30);
        a12.add(40);
        System.out.println(a12);
        System.out.println("-------------------------------------------------");
        ArrayList a21 = new ArrayList();
        a21.add(50);
        a21.add(20);
        a21.add(30);
        a21.add(80);
        System.out.println(a21);
        System.out.println("-------------------------------------------------");
        // 2.removeAll(collection)
        // a12.removeAll(a21);
        // System.out.println(a12);
        // 3.retianall(common eleement exist ,uniqueelement remove)
        a12.retainAll(a21);
        System.out.println(a12);
        // 4.clear
        a12.clear();
        System.out.println(a12);

        // // example
        // ArrayList a = new ArrayList();
        // for (int j = 0; j < 5; j++) {
        // a.add(j);
        // }
        // System.out.println(a);
        // System.out.println("-------------------------------------------------");
        // for (int j = 0; j < a.size(); j++) {
        // System.out.println(a.get(j));
        // }
        // System.out.println("-------------------------------------------------");
        // for (Object o : a) {
        // System.out.println(o);
        // }
        // System.out.println("-------------------------------------------------");
        // Iterator ix = a.iterator();
        // while (ix.hasNext()) {
        // System.out.println(ix.next());
        // }

        // System.out.println("-------------------------------------------------");

        /// remove the element from gthe collection (4 method)
        // 1->remove method accepting the object
        // list hierarchy->remove will take the index
        // other hieracrchy it will take the object

    }
}