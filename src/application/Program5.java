package application;

//Cria pasta 

import java.io.File;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path:");
		String strPath = sc.nextLine();
		
		System.out.println("Enter the name folder:");
		String nameFolder = sc.nextLine();
		
		
		boolean success = new File(strPath + "\\" + nameFolder).mkdir();
		System.out.println("Folder created successfully: " + success);
		
		sc.close();
	}
}
