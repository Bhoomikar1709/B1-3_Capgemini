package pack_Capgemini;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting5
{
	@Test
   void accept()
   {
	   System.setProperty("1","Bhoomi");
	   Assumptions.assumeTrue("Bhoomi".equals(System.getProperty("1")));
	   
   }
}
