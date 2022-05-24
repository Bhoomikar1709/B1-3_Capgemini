package pack_framework;

public abstract class NormalAcc  extends ShopAcc
{
	private final float deliveryCharges;
public NormalAcc(int accNo, String accname, float charges,float deliveryCharges) 
{
		super(accNo, accname, charges);
		this.deliveryCharges=deliveryCharges;
		
	}
public void bookProduct(float charges)
{
	System.out.println("Account no is "+this.getAccNo()+" Account name is: " +this.getAccname()+" "+"Charges is :" +(charges+deliveryCharges));
}
@Override
public String toString() {
	return String.format("NormalAcc [deliveryCharges=%s,toString()=%s]", deliveryCharges,super.toString());
}


}
