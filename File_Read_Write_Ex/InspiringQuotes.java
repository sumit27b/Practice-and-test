package question_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class InspiringQuotes {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		try {
			writeInFile(sc);
		} catch (FileNotFoundException e) {
			System.out.println(e+" try again");
		}

		readFromFile();

	}

	public static void writeInFile(Scanner sc) throws FileNotFoundException {

		System.out.println("Write Inspiring Quotes:");
		OutputStream fout=new FileOutputStream("InspiringQuotes.txt");
		PrintWriter pw=new PrintWriter(fout);

		boolean flag=true;
		while(flag) {
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("quit")) break;
			pw.append(s);		//this will append quotes in file
			pw.flush();			//this clear buffer before saving
		}
		pw.close();
	}

	public static void readFromFile() {
		try {
			InputStream fin =new FileInputStream("InspiringQuotes.txt");
			Scanner read=new Scanner(fin);
			System.out.println("Inspiring Quotes:");
			while (read.hasNext()) {
				System.out.println(read.nextLine());
				System.out.println();
			}
			read.close();

		} catch (FileNotFoundException e) {
			System.out.println(e+" try again");
		}
	
	}
}


