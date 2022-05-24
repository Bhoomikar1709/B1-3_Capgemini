package pack_application;

import pack_framework.NormalAcc;

public class GSNormalAcc extends  NormalAcc
{

	public GSNormalAcc(int accNo, String accname, float charges, float deliveryCharges)
	{
		super(accNo, accname, charges, deliveryCharges);
		
	}

	@Override
	public String toString() {
		return String.format("GSNormalAcc [toString()=%s]", super.toString());
	}

}
