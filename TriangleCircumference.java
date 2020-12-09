import java.util.Scanner;
public class TriangleCircumference {
	public static void main(String[] args){
        Scanner input=new Scanner(System.in);
		System.out.print("Please enter three sides of a triangle: ");
		int side1=input.nextInt();
		int side2=input.nextInt();
		int side3=input.nextInt();
		if((side1+side2)>side3 &&(side1+side3)>side2 &&(side3+side2)>side1){
			System.out.print("The perimeter of the triangle is: "+(side1+side2+side3));
		}else{
			System.out.print("These input values qre not valid!");
		}
		
	}
}
