
public class Ex10 {

	public static void main(String[] args) {
		//6�� 
		int year = 2022;
		System.out.println( (year % 400==0) || (year % 4 ==0) && (year % 100!=0));
		System.out.println(year/4.0);
		
		//7��
		boolean powerOn = true;
		System.out.println("7:"+ !powerOn);
		//8��
		String str = "yes";
		System.out.println("8:"+str.equals("yes"));
		
		//1��
		int x = 15;
		boolean b =(x >10 && x<20);
		System.out.println(b);
		//2��
		char ch='\t';
		System.out.println((ch != ' ' || ch != '\t'));
		//3��
		char ch2='x';
		System.out.println(ch2 =='x' || ch2 =='X');
		//4��
		char ch3 = '5';
		System.out.println((ch3 >='0' && ch3 <='9'));
		//5��
		char ch4 = 'a';
		System.out.println((ch4 >='A' && ch4 <='Z') || (ch4 >= 'a' && ch4<='z'));
		
	}

}
