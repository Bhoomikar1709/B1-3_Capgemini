package Collection_capgemini;

import java.util.HashMap;
import java.util.Map;
public class example7 {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<Integer,String>();
		obj.put(1,"Bumi");
		obj.put(3,"Shetty");
		System.out.println(obj);
		obj.remove(3);
		System.out.println(obj);
	}

}
