package Collection_capgemini;


import java.util.Vector;
public class Example6 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(0,"Bumi");
		v.add(1,21);
		v.add(2,65.33);
		System.out.println(v);
		v.setElementAt(22,1);
	    System.out.println(v);

	}

}
