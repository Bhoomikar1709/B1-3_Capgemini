package pack_framework;

public abstract class ShopAcc 
{
  private int accNo;
  private String accname;
  private float charges;
public ShopAcc(int accNo, String accname, float charges)
{
	
	this.accNo = accNo;
	this.accname = accname;
	this.charges = charges;
}
abstract public void bookProduct(float charges);
 public void items(float charges)
 {
	 System.out.println(charges);
 }
 
 
public int getAccNo() {
	return accNo;
}
/*public void setAccNo(int accNo) {
	this.accNo = accNo;
}*/
public String getAccname() {
	return accname;
}
/*public void setAccname(String accname) {
	this.accname = accname;
}*/
public float getCharges() {
	return charges;
}
/*public void setCharges(float charges) {
	this.charges = charges;
}*/
public float getCharge()
{
	return charges;
}
@Override
public String toString() {
	return String.format("ShopAcc [accNo=%s, accname=%s, charges=%s]", accNo, accname, charges);
}
 
  
}
