package PhaseOneProject;

import java.io.*;
import java.util.*;
import PhaseOneProject.BusinessLevelOperations;


public class ApplicationMenu {

	public static void main(String[] args) {
		welcomeScreen();
		
			try {
				menuDriven();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static void welcomeScreen() {
		System.out.println("Application Name : LOCKED ME \n");
		System.out.println("***************************************");
		System.out.println("Developer Details: Chandrashekar S \n");
		System.out.println("****************************************");
	}

	public static void menuDriven() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		BusinessLevelOperations business = new BusinessLevelOperations();
		int option;
		do {
		System.out.println("*******Select any option(1-3) from below and press enter********* \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Business-level operations \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Dsplaying all files with directory structure in ascending order");
			System.out.println("******************************************************************");
			business.showAllFiles();
			System.out.println("******************************************************************");
			
			
			break;
		case 2:
			int ch;
		do {
			System.out.println("********Select any option(1-4) from below and press enter*******");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file and its from a directory");
			System.out.println("\t3. Search a file from a directory");
			System.out.println("\t4. Exit from Business Level Operation menu");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				business.addFile();
				System.out.println("***********************************************");
				break;
			case 2:
				business.deleteFile();
				System.out.println("***********************************************");
				break;
			case 3:
				business.searchFile();
				System.out.println("************************************************");
				break;
			case 4:
				System.out.println("Exited from the Business Level operation menu..");
				System.out.println("************************************************\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		}while(option!=3);
		
	}
}

