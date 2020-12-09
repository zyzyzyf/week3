import java.util.Scanner;
public class judgeRectangleRelation {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter r1's center x-, y-coordinates, width, and radius: ");
		double x1Coordinate=input.nextDouble();
		double y1Coordinate=input.nextDouble();
		double width1=input.nextDouble();
		double height1=input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and radius: ");
		double x2Coordinate=input.nextDouble();
		double y2Coordinate=input.nextDouble();
		double width2=input.nextDouble();
		double height2=input.nextDouble();
		
		double width=(width1+width2)/2;
		double height=(height1+height2)/2;
		double distance=Math.sqrt(Math.pow(x1Coordinate-x2Coordinate, 2)+Math.pow(y1Coordinate-y2Coordinate, 2));
		
		if(distance<=width && distance<=height){
			System.out.print("r2 is inside r1");
		}else if(Math.pow(distance, 2) == (Math.pow(width, 2)+Math.pow(height, 2))){
			System.out.print("circle2 overlaps circle1");
		}else{
			System.out.print("circle2 does not overlap circle1");
		}
	}
}
