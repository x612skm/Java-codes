import java.util.*;
import java.io.*;

class Classroom{
	public static void main(String[] args){
		Student[] arr;
		int n,i=0,roll,marks;
		String name;
		System.out.print("Enter number of students: ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		arr=new Student[n];
		
		for(i=0;i<n;i++){
			System.out.println("Enter name : ");
				name=sc.nextLine();
			System.out.println("Enter roll : ");
				roll=sc.nextInt();
			System.out.println("Enter marks : ");
				marks=sc.nextInt();
			arr[i]=new Student(name,roll,marks);
		}
		Arrays.sort(arr,new descsort());
		for(i=0;i<n;i++){
			arr[i].display();
		}
	}
}
class Student{
	public String name;
	public int rollno;
	public int marks;
	
	Student(String name,int rollno,int marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	public void display(){
		System.out.println(" Name "+name);
		System.out.println(" Roll Number "+rollno);
		System.out.println(" Marks "+marks);
		System.out.println();
	}
}
class descsort implements Comparator<Student>{
	public int compare(Student a,Student b){
		return b.marks-a.marks;
	}
}
