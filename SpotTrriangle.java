import java.util.Scanner;
public class SpotTrriangle {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		System.out.print("Point ("+x+","+y+") is ");
		if(x<=200&&x>=0&&y>=0&&y<=100&&(y+0.5*x<100)) System.out.print("in the triangle");
		else System.out.print("not in the triangle");
	}
}
