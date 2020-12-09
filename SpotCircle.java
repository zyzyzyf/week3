import java.util.Scanner;
public class SpotCircle {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.print("Point ("+x+","+y+") is ");
		if(distance<=10) System.out.print("in the circle");
		else System.out.print("not in the circle");
	}
}
