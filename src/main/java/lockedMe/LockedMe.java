package lockedMe;

import java.util.Scanner;

public class LockedMe {
	

	public static void main(String[] args)
	{
		displayWelcome();
		Scanner obj = new Scanner(System.in);
		int ch;
		do {
			displayMenu();
			ch=Integer.parseInt(obj.nextLine());
			
			switch(ch)
			{
			case 1: getAllFiles();
				break;
			case 2:creatFiles();
				break;
			case 3:deleteFiles();
				break;
			case 4:searchFiles();
				break;
			case 5:
			System.out.println("\tThanks For Using LockedMe.com");
			System.out.println("-----------------------------------------------");
			System.exit(0);
			break;
			default: System.out.println("Invalid Option ");
			break;
			}
		}
		while(ch>0);
		obj.close();
	}
	
public static void displayWelcome()
{
	System.out.println("====================================================");
	System.out.println("\t\tWelcome to Lockedme.com ");
	System.out.println("====================================================");
	System.out.println("\t\tDeveloped by Mr.Sagar Godambbe");
	System.out.println("----------------------------------------------------");
}
public static void displayMenu()
{System.out.println("Enter Your Choice: ");
System.out.println("\t\t1:Display all the Files:");
System.out.println("\t\t2:Add a New file:");
System.out.println("\t\t3:Delete a File:");
System.out.println("\t\t4:Search a File:");
System.out.println("\t\t5:Exit");
}

public static void getAllFiles()
{
}
public static void creatFiles()
{	
}
public static void deleteFiles()
{
}
public static void searchFiles()
{
}
}