package PhaseOneProject;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BusinessLevelOperations {

	List<String> retrieve= new ArrayList<String>();
	File[] files = new File("C:\\Users\\chand\\eclipse-workspace\\Simplilearn").listFiles();
	public void showAllFiles() {
		// TODO Auto-generated method stub
		for(File file : files) {
			if(file.isFile()) {
				retrieve.add(file.getName());
				System.out.println(file.getName());
			}
		}
		retrieve.forEach(System.out::println);
		
	}
	

	public void addFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file which you wish to add:");
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File F= new File(filename);
		try {
			if(F.createNewFile()) {
				System.out.println(filename+" file is added to the directory Sucessfully");
				Desktop.getDesktop().edit(F);
			}
			else {
				System.out.println("This file is already there");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	public void deleteFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file which you wish to delete:");
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File F= new File(filename);
		if(F.delete())
			System.out.println(filename+" File Deleted Sucessfully");
		else
			System.out.println("File Not Found");
	}

	public void searchFile() {
		// TODO Auto-generated method stub
		try {	
			Scanner scan= new Scanner(System.in);
			File directory = new File("C:\\\\Users\\\\chand\\\\eclipse-workspace\\\\Simplilearn");
			System.out.println("Enter the file name which you wish to search:");
			String fileName=scan.nextLine();
            File[] files=directory.listFiles();
            int flag=0;
            for (File file : files) {
                String name = file.getName();
                if (name.equals(fileName)) {
                       System.out.println("The filename "+fileName+" as found in the directory");
                       System.out.println("*****************************************************");
                       System.out.println(" The file details are below");
                       System.out.println("******************************************************");
        				File f= new File(fileName);
        				Scanner sc1 = new Scanner(f);
        				while(sc1.hasNextLine()) {
        				System.out.println(sc1.nextLine());
        				}
        			flag=1;	
                }
			}
        if(flag==0) {
        	System.out.println("File not found");
        }
        	
		}catch(FileNotFoundException ex) {
			System.out.println("file not found");
		}
		
	}

}
