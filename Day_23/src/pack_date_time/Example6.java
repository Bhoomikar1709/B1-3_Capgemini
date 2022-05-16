package pack_date_time;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
	LocalTime t=LocalTime.now(ZoneId.of("Asia/Kolkata"));
	
             for(String s:ZoneId.getAvailableZoneIds())
              {
	                   System.out.println(s);
                 }
	}

}
