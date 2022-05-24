package pack_framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
public PrimeAcc(int accNo, String accname, float charges,boolean isPrime)
{
		super(accNo, accname, charges);
	this.isPrime= isPrime;
}
	public void bookProduct(float charges)
	{
		System.out.println("Account no is "+this.getAccNo()+" Account name is: " +this.getAccname()+" "+"Charges is :" +charges);
	}
	

@Override
public String toString() {
	return String.format("PrimeAcc [isPrime=%s,toString()=%s]", isPrime,super.toString());
}




}
