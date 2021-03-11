package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Circle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner tc = new Scanner(System.in);
		
		List<Shape> shape = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = tc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Shape #" + (i+1) + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = tc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(tc.next());
			if(ch == 'r') {
				
				System.out.print("Width: ");
				Double width = tc.nextDouble();
				System.out.print("Height: ");
				Double height = tc.nextDouble();
				shape.add(new entities.Rectangle(color, width, height));
				
			}else {
				
				System.out.print("Radius: ");
				Double radius = tc.nextDouble();
				shape.add(new Circle(color, radius));
			}
			
			System.out.println();
			System.out.println("");
			for(Shape sh: shape) {
				System.out.println(String.format("%.2f", sh.area()));
			}
		}
		
		
		tc.close();
	}

}
