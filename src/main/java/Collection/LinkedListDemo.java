package Collection;import java.util.LinkedList;public class LinkedListDemo {    public static void main(String[] args) {        LinkedList l = new LinkedList();        l.add("arpan");        l.add("Mishra");        l.add(4);        l.add("Mishra");        l.add(null);        System.out.println(l);        l.addFirst("Mr.");        System.out.println(l);        System.out.println("Last eleemnt is: "+l.getLast());        l.removeFirst();        System.out.println(l);    }}