package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Good Afternoon", "Good night" };
		String path = "c:\\temp\\out.txt";
		
		//Se passar o parametro true no metodo FileWriter o programa não recriará o arquivo, mas escreverá o conteúno no final do arquivo criado
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { 
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
