import java.util.Scanner;
 class Time1224{
	int hour,minute,second;
	public Time1224(){}
	public Time1224(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public Time1224 addTime(Time1224 t1){
		Time1224 t=new Time1224();
		t.second=this.second+t1.second;
		if(second>=60){
			t.second=t.second%60;
			t.minute=t.minute+1;
		}
		if(t.minute>=60){
			t.minute=t.minute%60;
			t.hour=t.hour+1;
		}
		t.hour=this.hour+t.hour;
		if(t.hour>=24){
			t.hour=t.hour%24;
		}
		return t;
	}

	public void Display(){
		System.out.printf("%d:%d:%d\n",hour,minute,second);

	}
}
 class Date{
	private int date;
	private int month;
	private int year;

	/*
	constructor when no date is given
	initialize to 1st Jan,1970.
    */	
    //default constructor
	Date(){
		date=1;
		month=1;
		year=1970;
	}

    //constructor with two parameter date and month
    //parameterised constructor(partially)
	Date(int d,int m){
		date=d;
		month=m;
		year=1970;//as per the georgian calaneder
	}

    //constructor when all the parameters are given
    //completely parameterised
	Date(int d,int m, int y){
		date=d;
		month=m;
		year=y;
	}

    
    public void setDay(){
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter Day:- ");
        date=sc.nextInt();
    }
    public void setMonth(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month:- ");
        month=sc.nextInt();
    }
    public void setYear(){
      	Scanner sc=new Scanner(System.in);
        System.out.print("Enter year:- ");
        year=sc.nextInt();
    }

   // Accesors
    public int getDay(){
        return date;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }


	public void display(){
		System.out.println(date+"/"+month+"/"+year);
	}
}
class trainShedule{
	Time1224 deptTime=new Time1224();
	Time1224 arrTime=new Time1224();
	Date d1=new Date();
	int trainNo,stationCode;
	trainShedule(){}
	trainShedule(int trainNo,Time1224 deptTime,Time1224 arrTime,Date d1,int stationCode){
		this.trainNo=trainNo;
		this.deptTime=deptTime;
		this.arrTime=arrTime;
		this.d1=d1;
		this.stationCode=stationCode;
	}

	public void display(){
		System.out.println("trainNo: "+trainNo);
		System.out.print("deptTime: ");deptTime.Display();
		System.out.print("arrTime: ");arrTime.Display();
		System.out.print("Date: ");d1.display();
		System.out.println("stationCode: "+stationCode);
	}



}


 class ku{
	public static void main(String[] args) {
		System.out.println("Train 1: ");
		System.out.println();
		Time1224 deptTime=new Time1224(5,12,14);
		Time1224 arrTime=new Time1224(6,45,47);
		Date d1=new Date();
		trainShedule t1=new trainShedule(5,deptTime,arrTime,d1,45);
		t1.display();
		System.out.println();
		System.out.println("Train 2: ");
		System.out.println();
		Time1224 deptTime2=new Time1224(12,12,12);
		Time1224 arrTime2=new Time1224(12,45,47);
		Date d12=new Date(12,6,2020);
		trainShedule t12=new trainShedule(5,deptTime2,arrTime2,d12,45);
		t12.display();
		System.out.println();

	}
}