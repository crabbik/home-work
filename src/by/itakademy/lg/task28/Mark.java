package by.itakademy.lg.task28;

public class Mark {
	String fName;
	int lName;
	int mark;

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
