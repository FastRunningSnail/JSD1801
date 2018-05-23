package me.date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z",new Locale("zh"));
		System.out.println(sdf);
		Date local = new Date();
		String local_str = sdf.format(local);
		System.out.println(local_str);
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z",new Locale("zh"));
		
		Date now = new Date();
		now.setTime(11121314);
		String now_str = sd.format(now);
		System.out.println(now_str);
		
		//将当前时间以yyyy-MM-dd的格式输出
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd h:m:s S");
		Date no_str = s.parse("2018-02-28 11:12:13 123");
		System.out.println(no_str);
		
		Timestamp ts = new Timestamp(11121314);
		System.out.println(ts);
		sdf = new SimpleDateFormat("y-mm-ss");
		String d1 = sdf.format(11121314);
		System.out.println(d1);
	}

}
