package reserve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		 SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy");
		 SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		 
		 
		 Date x1 = new Date();
		 Date x2 = new Date(System.currentTimeMillis());
		 Date x3 = new Date(0l);
		 Date x4 = new Date(1000l * 60l * 60l * 5l);
		 
		 
		 Date y1 = sdf1.parse("25/06/2021");
		 Date y2 = sdf2.parse("13/10/2021 11:53:43");
		 Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07z"));
		 
		 System.out.println("x1: " + x1);
		 System.out.println("x2: " + x2);
		 System.out.println("x3: " + x3);
		 System.out.println("x4: " + x4);		 
		System.out.println("-----------------------------------");
		System.out.println("x1: " + sdf2.format(x1));
		 System.out.println("x2: " + sdf2.format(x2));
		 System.out.println("x3: " + sdf2.format(x3));
		 System.out.println("x4: " + sdf2.format(x3));
	}
}
