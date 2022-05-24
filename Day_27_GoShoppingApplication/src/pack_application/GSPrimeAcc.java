package pack_application;

import pack_framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{

	public GSPrimeAcc(int accNo, String accname, float charges, boolean isPrime)
	{
		super(accNo, accname, charges, isPrime);
		
	}

	@Override
	public String toString() {
		return String.format("GSPrimeAcc [toString()=%s]",super.toString());
	}

}
