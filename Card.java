import java.util.Scanner;
public class Card {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("The card you picked is ");
		int number1=(int)Math.round((Math.random()*13+1));
		int number2=(int)Math.round((Math.random()*3+1));
		String s="";
		switch(number1){
		case 1:s="Ace";break;
		case 2:s="2";break;
		case 3:s="3";break;
		case 4:s="4";break;
		case 5:s="5";break;
		case 6:s="6";break;
		case 7:s="7";break;
		case 8:s="8";break;
		case 9:s="9";break;
		case 10:s="10";break;
		case 11:s="Jack";break;
		case 12:s="Queen";break;
		case 13:s="King";break;
		}
		String s2="";
		switch(number2){
		case 1:s2="Clubs";break;
		case 2:s2="Diamonds";break;
		case 3:s2="Hearts";break;
		case 4:s2="Spades";break;
		}
		System.out.print(s+" of "+s2);
	}
}
