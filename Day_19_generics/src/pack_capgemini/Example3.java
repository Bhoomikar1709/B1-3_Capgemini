package pack_capgemini;

import java.util.ArrayList;
import java.util.Iterator;



public class Example3 {

	public static void main(String[] args) {
	ArrayList<String>obj=new ArrayList<>();
	obj.add("Bumi");
	obj.add("Shetty");
	String res=obj.get(0);
	System.out.println(res);
	
	System.out.println(obj);
	Iterator<String>i=obj.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
	}

}
