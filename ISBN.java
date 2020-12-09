import java.util.*;
public class ISBN {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		Scanner in =new Scanner(System.in);
		String sc=in.nextLine();
		for(int i=0;i<9;i++){
			char c=sc.charAt(i);
			sum=sum+(int)c*(i+1);
		}
		char y=(char)(sum%11);
		System.out.println(y);
		StringBuffer s=new StringBuffer(sc);
		if(y==10){
			s.insert(9,'X');
		}else{
			s.insert(9,y);
		}
		System.out.println("The ISBN-10 number is :"+s);	
	}

}
