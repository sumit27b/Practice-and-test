package Study.collection;
import java.util.Scanner;

public class UserOfPalette {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Palette palette =new Palette();
		boolean check=true;
		while(check) {
			System.out.println("press below number to perform:");
			System.out.println("1 Add color to palette");
			System.out.println("2 Show all color in palette");
			System.out.println("3 remove color from palette");
			System.out.println("4 search for color in palette");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:System.out.println("enter color to Add in palette:");
				palette.addToPalette(sc.next()); break;
			
			case 2:System.out.println("All color available in palette:");
				palette.showAllColorInPalette(); break;
			
			case 3:System.out.println("enter color to remove from palette:");
				palette.removeColor(sc.next());	break;
			
			case 4:System.out.println("enter color to search in palette:");
				palette.isColorInPalette(sc.next()); break;	
				
			default: check=false;
				break;
			}
		}
		sc.close();
	}
}
