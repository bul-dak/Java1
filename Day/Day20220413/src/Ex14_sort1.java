import java.util.Arrays;

public class Ex14_sort1 {  //p.201 5-10 Sort (����)
	

	public static void main(String[] args) {
		int[] num = new int[5];
		
		for (int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(num));
		
		
		for (int i=0;i<num.length-1;i++) {
			boolean changed = false; //�ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.
		
			for(int j=0;j<num.length-1-i;j++) {
				if (num[j] > num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
					changed = true;  //�ڸ��ٲ��� �߻������� true�� �����Ѵ�.
			}
		}// end for j
			
			if (!changed) break;  //�ڸ��ٲ��� ������ �ݺ����� �����.
			
			for (int k=0; k<num.length;k++)
				System.out.printf("%d"+" ",num[k]);

			System.out.println();
		}//end for i
	
	}

}
