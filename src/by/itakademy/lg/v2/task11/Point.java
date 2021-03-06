package by.itakademy.lg.v2.task11;

public class Point {
	private String x;
	private String y;
	private String unit;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", unit=" + unit + "]";
	}

}
