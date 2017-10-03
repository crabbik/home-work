package by.itakademy.lg.task22;

import java.util.Date;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		long time1 = new Date().getTime();
		Thread.sleep(5000);
		long time2 = new Date().getTime();

		TimePeriod timePeriod = new TimePeriod(time1, time2);
		timePeriod.printDate();
		
		
		int compareIsOn=timePeriod.compareTo(new TimePeriod(0, 5000));
		System.out.println(compareIsOn);	

	}

}
