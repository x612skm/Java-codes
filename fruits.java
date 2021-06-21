import java.util.*;


class fruits
{
	public static void main(String[] args)
	{
		Vector<String> vector = new Vector<>();
		String fruit;
		int position;
		Scanner sc = new Scanner(System.in);
			vector.add("kela");
			vector.add("aam");
			vector.add("santra");
		System.out.println("fruits in the vector  :: " +vector);
		System.out.println();
		System.out.println("following are the operations to perform ");
		System.out.println("enter one fruit you wish to add at the end of the vector ");
		fruit=sc.nextLine();
		vector.add(fruit);
		System.out.println("vectoroial fruits that are queued are :: "+vector);
		System.out.println();
		System.out.println("*****insertion and deletion process*********");

		System.out.println("enter the name of the fruit and the desired position you want to add in ::: ");
		System.out.print("name of the fruit :: ");
			fruit=sc.nextLine();
		System.out.println("enter the positon :: ");
			position=sc.nextInt();
			vector.insertElementAt(fruit,(position-1));
		System.out.println("vector as follows :: " +vector);
		System.out.println();
		System.out.println("enter positon you wish to delete ::");
			position=sc.nextInt();
			vector.remove((position-1));
		System.out.println("vector as follows :: " +vector);

//copying
		String[] cpVec = new String[vector.size()];
		vector.copyInto(cpVec);
		for(int arr=0; arr<vector.size(); arr++)
			System.out.print(cpVec[arr]+" ");
	}
}
