package pack_capgemini;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,String>obj=new HashMap<Integer,String>();
       obj.put(1,"Bumi");
       obj.put(5,"Shetty");
       System.out.println(obj);
       Set<Entry<Integer,String>>obj1=obj.entrySet();
       Iterator<Map.Entry<Integer,String>>itr=obj1.iterator();
       while(itr.hasNext())
       {
    	   Map.Entry e1=itr.next();
    	   System.out.println(e1.getKey()+" "+e1.getValue());
       }
	}

}
