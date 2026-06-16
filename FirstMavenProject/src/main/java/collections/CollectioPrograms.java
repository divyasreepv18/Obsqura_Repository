package collections;

import java.util.LinkedList;
import java.util.List;

public class CollectioPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List <Integer> l= new LinkedList<Integer>();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(4);
      l.add(5);
      System.out.println(l);
      System.out.println(l.get(0));
      System.out.println(l.get(1));
      l.set(0, 9);
      System.out.println(l);
      System.out.println("Size :"+l.size());
      System.out.println("Is Empty list :"+l.isEmpty());
      System.out.println(l.contains(1));
      System.out.println(l.contains(9));
      l.remove(0);
      System.out.println("Remove value "+l);
      System.out.println(l.indexOf(1));
      System.out.println(l.indexOf(5));
      l.add(5);
      System.out.println(l);
      System.out.println(l.indexOf(5));
      System.out.println(l.lastIndexOf(5));
	}

}
