package pack_framework;

public abstract class BankFactory 
{
	 abstract public SavingAcc getNewSavingAcc(int accNo, String accNm, float accbal,boolean isSalaried);
	  abstract public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creditLimit);
}
