package pack_application;

import pack_framework.NormalAcc;
import pack_framework.PrimeAcc;
import pack_framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{

	

	
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accname, float charges, boolean isPrime)
	{
		GSPrimeAcc p=new GSPrimeAcc(accNo, accname, charges, isPrime);
		return p;
	}

	
	public GSNormalAcc getNewNormalAcc(int accNo, String accname, float charges, float deliveryCharges)
	{
		GSNormalAcc n=new GSNormalAcc(accNo, accname, charges, deliveryCharges);
		return n;
		
	}
    
}
