import java.util.Arrays;

public class Ex02 { //�Լ��̿��� sort

	public static void main(String[] args) {
		   // ������ �迭 5�� ����
	      // �ʱ�ȭ�� �����Լ� ���ؼ� 1~100 ���̰��� ���� �� ���

	      int[] num = new int[5];

	      for (int i = 0; i < num.length; i++) {
	         num[i] = (int)(Math.random() *100) + 1;
	      }
	      System.out.println(Arrays.toString(num));

	      sort(num);

	   }

	   public static void sort(int[] num) {
	      for (int i = 0; i < num.length-1; i++) {
	         for (int j = i+1; j < num.length; j++) {
	            if(num[i] > num[j]) {
	               int min = num[i];
	               num[i] = num[j];
	               num[j] = min;
	            }
	         }
	      }

	      System.out.println(Arrays.toString(num));
	}

}
