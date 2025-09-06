# ListClass:

1. ArrayList
2. Vector
3. Stack
4. LinkedList


``` java

// all supports iterators.
class st{
    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("ArrayList with Iterator : ");
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while(listIterator.hasNext()){
            Integer pp = listIterator.next();
            System.out.println(pp);
        }
        System.out.println();System.out.println();

        // 2. Vector
        Vector<Integer> p = new Vector<Integer>();
        p.add(150000);
        p.add(180000);
        p.add(250000);

        System.out.println("Vector with Iterator : ");
        ListIterator<Integer> li = p.listIterator();
        while(li.hasNext()){
            Integer pp = li.next();
            System.out.println(pp);
        }
        System.out.println();System.out.println();

        // 3. Stack
        Stack<String> s = new Stack<String>();
        s.push("ranjith");
        s.push("dot");
        s.push("doc");
        s.push("ranjith");

        System.out.println("Stack with Iterator : ");
        Iterator<String> stackIterator = s.iterator();
        while(stackIterator.hasNext()){
            String pp = stackIterator.next();
            System.out.println(pp);
        }
        System.out.println();System.out.println();

        // 4. LinkedList

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("LinkedList with Iterator : ");
        Iterator<Integer> linkedListIterator = linkedList.iterator();
        while(linkedListIterator.hasNext()){
            Integer pp = linkedListIterator.next();
            System.out.println(pp);
        }
        System.out.println();System.out.println();

    }
}

```