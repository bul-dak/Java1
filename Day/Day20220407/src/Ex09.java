
public class Ex09 {

	public static void main(String[] args) {
		char ch = 'A'; 
		
		char lowerCase = (ch >= 'A' && ch <='Z') ? (char)(ch+32) : ch ;
				                                         // -> int�� ch����ȯ������Ѵ�.
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}

}
