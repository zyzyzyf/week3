import java.util.Scanner;
public class SpotRectangle {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double distancex=Math.abs(x-0);
		double distancey=Math.abs(y-0);
		System.out.print("Point ("+x+","+y+") is ");
		if(distancex<=5 && distancey<=2.5) System.out.print("in the rectangle");
		else System.out.print("not in the rectangle");
	}
}
