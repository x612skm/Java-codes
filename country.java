import java.util.Scanner;
import java.util.Arrays;


class Country{
	public static void main(String[] args) {
		String arr[][]={{"USA","New York"," Washington DC","Chicago", "Boston"},
						{" SOUTHAFRICA","Cape Town"," Port Elizabeth"," Johannesburg"},
						{"ENGLAND","London","Glasgow","Liverpool"},
						{"FRANCE","Paris"," "," "," "},
						{"INDIA","New Delhi", "Mumbai","Kolkata","Chennai"}};
		String[] cities={"New York","Washington DC","Chicago", "Boston"	,"Capetown","Portelizabeth",
						"Johannesburg","London","Glasgow","Liverpool","Paris",
						"New Delhi", "Mumbai","Kolkata","Chennai"};			
		int i,non,flag=1;
		String country;
		Scanner sc=new Scanner(System.in);
		System.out.println(" following cities have data :: USA :: SOUTHAFRICA :: ENGLAND :: FRANCE :: INDIA ::");
		System.out.println();
		System.out.print("name the country from data you wish to search cities of :: ");
			country=sc.nextLine();
		for (i=0;i<=4 ;i++ ) 
		{
			if(country.equalsIgnoreCase(arr[i][0])==true)
			{
				flag=0;
				System.out.print("Cities in "+ country.toUpperCase() + " are: ");
					for ( non=1; non<=10; non++ )
					{
						System.out.print(arr[i][non]+","+" ");
								
					}
			}
		}
		if(flag==1)
		System.out.println("enter from the data :: country not found in the data ");
		System.out.println();
		System.out.println("sorted cities are ");
        Arrays.sort(cities);
        for (i=0;i<cities.length;i++) {
        	System.out.println(cities[i]);
        }

	}
}