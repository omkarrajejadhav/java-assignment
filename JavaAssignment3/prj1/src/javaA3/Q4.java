package javaA3;

class Q4
{
	public static void main(String[] args) {
		Time t1=new Time(11, 32, 45);
		t1.display();
		
	}
}

 class Time {
	public int hr;
	public int min;
	public int sec;
	
	
	public Time(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	public void setHr(int hr) {
		if(0<hr && hr<=24 ) {
		   this.hr=hr;
		}
		else
			this.hr=0;
	}
	public void setMin() {
		if(min<60) {
			this.min=min;
		}
		else
			this.min=0;
	}
	public void setSec() {
		if(min<60) {
			this.sec=sec;
	}
		else
			this.sec=0;
}
	public void display() {
		System.out.println("Time\t"+hr+":"+min+":"+sec);
	}
	
	
}