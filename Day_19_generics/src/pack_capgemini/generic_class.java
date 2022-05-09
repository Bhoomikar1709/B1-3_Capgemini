package pack_capgemini;

public class generic_class<T>
{
 T val;
 T val1;
 void print()
 {
      System.out.println(val.getClass());	 
 }

	public static void main(String[] args) {
		generic_class<Integer>obj=new generic_class<>();
		generic_class<String>obj1=new generic_class<>();
		obj.val=19;
		obj1.val="Bumi";
		obj.print();
		obj1.print();
	}

}
