import java.util.*;
import java.io.*;

class Assignment3_2{
	public static void main(String[] args){
		Student[] arr;
		int n,i=0,rn;
		int m;
		String nm;
		System.out.print("Enter number of students: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new Student[n];
		
		for(i=0;i<n;i++){
			System.out.print("Enter name : ");
			nm=sc.nextLine();
			System.out.print("Enter roll : ");
			rn=sc.nextInt();
			System.out.print("Enter marks : ");
			m=sc.nextInt();
			arr[i]=new Student(nm,rn,m);
		}
		Arrays.sort(arr,new descsort());
		for(i=0;i<n;i++){
			arr[i].display();
			//System.out.print(arr[i].marks);
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
		System.out.println("Student Name "+name);
		System.out.println("Student Roll Number "+rollno);
		System.out.println("Student Marks "+marks);
		System.out.println();
	}
}
class descsort implements Comparator<Student>{
	public int compare(Student a,Student b){
		return b.marks-a.marks;
	}
}
