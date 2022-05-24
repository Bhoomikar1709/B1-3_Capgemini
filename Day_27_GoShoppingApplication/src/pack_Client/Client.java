package pack_Client;
import pack_framework.NormalAcc;
import pack_framework.PrimeAcc;
import pack_framework.ShopFactory;
import pack_application.GSShopFactory;
import pack_application.GSPrimeAcc;
import pack_application.GSNormalAcc;

public class Client {
    public static void main(String[] args)
    {
    	ShopFactory s=new GSShopFactory();
    	PrimeAcc p=new GSPrimeAcc(11,"bumi",500,true);
    	NormalAcc n=new GSNormalAcc(12,"sru",500,50);
 System.out.println("Prime Account");
 p.bookProduct(p.getCharge());
 System.out.println("Normal Account");
 n.bookProduct(n.getCharges());
 //System.out.println(s.getnewPrimeAcc(1,"Ram", 1000, true));
 
 //System.out.println(s.getnewNormalAcc(2,"Raj", 1000, 50));
 
 System.out.println(p);
 System.out.println(n);
    }
}
