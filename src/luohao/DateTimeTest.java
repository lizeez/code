package luohao;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(Integer.valueOf(cal.get(Calendar.MONTH))+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(Calendar.getInstance().getTimeInMillis());
		
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		SimpleDateFormat oldFormatter = new SimpleDateFormat("YYYY/MM/dd");
		Date date1 = new Date();
		System.out.println(oldFormatter.format(date1));
		
		DateTimeFormatter newFormattter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date2 = LocalDate.now();
		System.out.println(date2.format(newFormattter));
		
		Calendar cal1 = Calendar.getInstance();
	    cal1.add(Calendar.DATE, -1);
	    System.out.println(cal1.getTime());
	    
	    LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(2);

        System.out.println(yesterday);
	}
	
	
}
