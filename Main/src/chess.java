import java.util.Scanner;

public class chess{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String letter=sc.nextLine();
		int num=sc.nextInt();
		
		if((num==1||num==3||num==5||num==7) && (letter.equals("A") || letter.equals("C") || letter.equals("E") || letter.equals("G"))) {
			System.out.println("Black Square");
		}
		else if((num==1||num==3||num==5||num==7) && (letter.equals("B") || letter.equals("D") || letter.equals("F") || letter.equals("H"))) {
			System.out.println("White Square");	
		}
		else if((num==2||num==4||num==6||num==8)&&(letter.equals("A") || letter.equals("C") || letter.equals("E") || letter.equals("G"))) {
			System.out.println("White Square");
		}
		else if((num==2||num==4||num==6||num==8)&& (letter.equals("B") || letter.equals("D") || letter.equals("F") || letter.equals("H"))) {
			System.out.println("Black Square");	
		}
		else {
			System.out.println("NOT FOUND");	
		}
	}
}