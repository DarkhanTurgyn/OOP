package problem4;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} 
		else System.out.println("Invalid input");   //exception
	}

	public String toUniversal() {
		return convert(hour);
	}

	public String toStandard() {
		if (hour >= 12) return convert(hour - 12) + " PM";
		else return toUniversal() + " AM";
	}

	public void add(Time time) {
		hour += time.hour;
		minute += time.minute;
		second += time.second;
		if (second >= 60) {
			second -= 60;
			minute++;
		}
		if (minute >= 60) {
			minute -= 60;
			hour++;
		}
		if (hour >= 24) hour -= 24;
	}
	
	private String convert(int h) {
		String s;
		if (h >= 10) s = Integer.toString(h);
		else s = '0' + Integer.toString(h);
		
		if (minute >= 10) s += ':' + Integer.toString(minute);
		else s += ":0" + Integer.toString(minute);
		
		if (second >= 10) s += ':' + Integer.toString(second);
		else s += ":0" + Integer.toString(second);
		
		return s;
	}
}
