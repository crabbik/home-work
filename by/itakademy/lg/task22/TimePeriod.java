package by.itakademy.lg.task22;

public class TimePeriod {

	private long timeFrom;

	public TimePeriod(long timeFrom, long timeTo) {
		super();
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
	}

	public long getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(long timeFrom) {
		this.timeFrom = timeFrom;
	}

	public long getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(long timeTo) {
		this.timeTo = timeTo;
	}

	private long timeTo;

	public void printDate() {
		String str = String.format(
				"Начало = %s, конец = %s, продолжительность = %s", timeFrom,timeTo, timeTo - timeFrom);
		System.out.println(str);

	}

	public int getTotalSeconds() {
		return (int) ((timeTo - timeFrom) / 1000);

	}
	public int compareTo(TimePeriod another){
				
		if (this.getTotalSeconds()<another.getTotalSeconds()){
			return -1;}
			
		else if(this.getTotalSeconds()>another.getTotalSeconds())
		{return 1;}
			else 
				{return 0;}
		
		
	}
}
