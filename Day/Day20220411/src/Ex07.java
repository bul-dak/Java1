
public class Ex07 { //p.174 4-29������ for������ �ٲ۰�

	public static void main(String[] args) {
		
		for (int i =1;i<=100; i++) {
			System.out.printf("i=%d",i);
			
			int tmp = i;
			
			for (;;) {
				if (tmp %10 %3==0 && tmp %10 !=0)	 //3�ǹ������ Ȯ��(0����)
					System.out.print("¦");
				
				if ((tmp /= 10) == 0) 
					break;	
			} 
			System.out.println();
		}
	}
}
