
public class Clock {
	private int hour;
	private int minute;
	private int second;
	//constructor
	Clock(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	//set and get functions
	public void sethour(int hour) {
		if(hour>23||hour<0) {
			this.hour=0;
		}else {
			this.hour=hour;	
		}
	}
	public void setminute(int minute) {
		if(minute>59||minute<0) {
			this.hour=0;
		}else {
		this.minute=minute;
		}
	}
	public void setsecond(int second) {
		if(second>59||second<0) {
			this.second=0;
		}else {
		this.second=second;
		}
	}
	public int gethour() {return hour;}
	public int getminute() {return minute;}
	public int getsecond() {return second;}
	public String displayTime() {
		return String.valueOf(hour)+":"+String.valueOf(minute)+":"+String.valueOf(second);
	}
}