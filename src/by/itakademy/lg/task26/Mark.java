package by.itakademy.lg.task26;

public class Mark {
	private String fName;
	private int lName;
	private int mark;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Mark(String fName, Integer lName, int mark) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Mark [Фамилия" + fName + ", Имя " + lName + ", Оценка " + mark + "]";
	}

}