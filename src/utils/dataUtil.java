package utils;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dataUtil {
	private static final SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
	
	public static Date stringToDate(String data) {
            try {
                Date d1 = new Date(s.parse(data).getTime());
                return d1;
            } catch (ParseException ex) {
                Logger.getLogger(dataUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
	}
	
	public static String dateToString(Date d) {
		return s.format(d);
	}
}