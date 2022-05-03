package Collection_capgemini;

import java.util.Deque;
import java.util.ArrayDeque;

public class Example4 {

	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		d.add(13);
		d.add("Bumi");
		System.out.println(d);
		d.addFirst(14);
		d.addLast("Shetty");
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
	}

}
