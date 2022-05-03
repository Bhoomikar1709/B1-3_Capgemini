package Collection_capgemini;

import java.util.Queue;
import java.util.PriorityQueue;
public class Example1 {

	public static void main(String[] args) {
		Queue obj=new PriorityQueue();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println(obj);
		obj.poll();
		System.out.println(obj);

	}

}
