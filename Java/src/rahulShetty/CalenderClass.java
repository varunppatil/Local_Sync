package rahulShetty;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance(); 
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.AM_PM));
	}

}