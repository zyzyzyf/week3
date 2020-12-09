import java.util.Scanner;
public class LotteryTicket {
	public static void main(String[] args){
		int lottery=(int)(Math.random()*1000);
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your lottery pick(three digits): ");
		int guess=input.nextInt();
		int lotteryDigits1=lottery/100;
		int lotteryDigits2=lottery/10%10;
		int lotteryDigits3=lottery%10;
		int guessDigits1=guess/100;
		int guessDigits2=guess/10%10;
		int guessDigits3=guess%10;
		System.out.println("The lottery number is " +lottery);
		if(guess==lottery) System.out.println("Exact match:you win $10,000");
		else if(((lotteryDigits1==guessDigits2)&&(lotteryDigits2==guessDigits3)&&(lotteryDigits3==guessDigits1))
				||((lotteryDigits1==guessDigits2)&&(lotteryDigits2==guessDigits1)&&(lotteryDigits3==guessDigits3))
				||((lotteryDigits1==guessDigits3)&&(lotteryDigits2==guessDigits1)&&(lotteryDigits3==guessDigits2))
				||((lotteryDigits1==guessDigits3)&&(lotteryDigits2==guessDigits2)&&(lotteryDigits3==guessDigits1))
				||((lotteryDigits1==guessDigits1)&&(lotteryDigits2==guessDigits3)&&(lotteryDigits3==guessDigits2))){
			System.out.println("Match all digits:you win $3,000");
		}
		else if((lotteryDigits1==guessDigits1)||(lotteryDigits1==guessDigits2)||(lotteryDigits1==guessDigits3)
				||(lotteryDigits2==guessDigits1)||(lotteryDigits2==guessDigits2)||(lotteryDigits2==guessDigits3)
				||(lotteryDigits3==guessDigits1)||(lotteryDigits3==guessDigits2)||(lotteryDigits3==guessDigits3)){
			System.out.println("Match one digits:you win $1,000");
		}
		else System.out.println("Sorry,no match");
	}
}
