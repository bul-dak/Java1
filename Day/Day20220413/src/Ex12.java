import java.util.Arrays;

public class Ex12 { 
	//������ �迭 5�� ����
	//�ʱ�ȭ�� �����Լ� ���ؼ� 1~100 ���̰��� ���� �� ���
	
	public static void main(String[] args) {
		int[] num = new int[5];
		
		for (int i=0;i<num.length;i++)
			num[i] = (int)(Math.random()*100)+1;
			
		System.out.println(Arrays.toString(num));
	
		
		// �ִ� �� �ּڰ� ��� �� ���
		//�ִ�, �ּڰ��� ��� �� ���ִ� ���� ����
		int max =num[0];
		int min=num[0];
		
		for(int i=0;i<num.length;i++) {
			
			if(max < num[i]) 
				max = num[i];
			
			if(min > num[i]) 
				min = num[i];
			}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		//Sort (����)
		
		System.out.println(Arrays.toString(num));
	}

}
