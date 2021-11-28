package Study.collection;

import java.util.TreeSet;


public class Palette {
	private TreeSet<String> colors;

	@Override
	public String toString() {
		return "colors=" + colors;
	}

	public TreeSet<String> getColors() {
		return colors;
	}

	public void setColors(TreeSet<String> colors) {
		this.colors = colors;
	}

	public Palette(TreeSet<String> colors) {
		super();
		this.colors = colors;
	}

	public Palette() {	//default constructor
		colors=new TreeSet<String>();
	}

	//////////////
	
	public void addToPalette(String color) {
		colors.add(color.toLowerCase());
	}


	public void showAllColorInPalette() {
		System.out.print("[ ");
		colors.stream().forEach((abc)->{System.out.print(abc+" ");});		//used lambda expression
		System.out.println("]\n");
	}

	public void removeColor(String color) {
		colors.remove(color);
	}

	
	public boolean isColorInPalette(String color) {
		boolean a=colors.stream().anyMatch((ele)-> color.equals(ele));	//anyMatch returns boolean value
		System.out.println("color found:"+a);
		return a;
	}

}
