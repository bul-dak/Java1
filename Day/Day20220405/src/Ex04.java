
public class Ex04 { // 3-14

	public static void main(String[] args) {
		char c = 'a';
		for(int i = 0; i<26; i++) { //��{}���� ������ 26�� �ݺ��Ѵ�.
			System.out.print(c++);   //'a' ���� 26���� ���ڸ� ����Ѵ�.
			
		}
		
		System.out.println(); //�ٹٲ��� �Ѵ�.
		
		c = 'A';
		for(int i = 0; i<26; i++)  {
			System.out.print(c++);  //System.out.println(c);
			                        //c++;
			
		}
		
		System.out.println();

		c = '0';
		for(int i = 0; i<10; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		//----------------------------------------------------------------
		
		float pi = 3.14159f;
		
		float result = (int)(pi*1000)/1000f;
		System.out.println(result);
		
		//3.142
		
		float result2 = (int)(pi*1000 + 0.5)/1000f; //0.5�� �����ָ� �ݿø�
		
		System.out.println(result2);
		
		//----------------------------------------------------------------
		
	
		
		
		
		
		
		
		
	}

}
