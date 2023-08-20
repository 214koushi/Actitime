package generic;

import java.util.Date;
import java.util.Random;

public class Javautility {
	public int getRandomno() {
		Random ran=new Random();
		int random=ran.nextInt(400);
		return random;
	}
	 public String getSystemDate() {
			Date d=new Date();
			String date = d.toString();
			return date;
		}
}
