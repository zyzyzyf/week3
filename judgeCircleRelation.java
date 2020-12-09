import java.util.Scanner;
public class judgeCircleRelation {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1Coordinate=input.nextDouble();
		double y1Coordinate=input.nextDouble();
		double radius1=input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2Coordinate=input.nextDouble();
		double y2Coordinate=input.nextDouble();
		double radius2=input.nextDouble();
		
		double absoluteValue=Math.abs(radius1-radius2);
		double centerDistance=Math.sqrt(Math.pow(x1Coordinate-x2Coordinate, 2)+Math.pow(y1Coordinate-y2Coordinate, 2));
		
		if(centerDistance<=absoluteValue){
			System.out.print("circle2 is inside circle1");
		}else if(centerDistance<=(radius1+radius2)){
			System.out.print("circle2 overlaps circle1");
		}else{
			System.out.print("circle2 does not overlap circle1");
		}
	}
}
