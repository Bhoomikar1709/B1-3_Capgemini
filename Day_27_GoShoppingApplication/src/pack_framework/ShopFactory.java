package pack_framework;

public abstract class ShopFactory
{
  abstract public PrimeAcc getNewPrimeAcc(int accNo, String accname, float charges,boolean isPrime);
  abstract public NormalAcc getNewNormalAcc(int accNo, String accname, float charges,float deliveryCharge);
  
	
}
