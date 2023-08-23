package application;

//Informações do caminho do arquivo 

import java.io.File;
import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
				
		System.out.println("File name: " + path.getName());
		System.out.println("Parent file: " + path.getParent());
		System.out.println("Path name: " + path.getPath());
		
		sc.close();
	}
}
