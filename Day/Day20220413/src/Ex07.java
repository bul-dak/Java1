import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[5]; //5ĭ�� 10ĭ���� Ȯ�� ����

		int[] tmp = new int[iArr1.length*2];
		
		
		for (int i =0;i<iArr1.length;i++) {
			iArr1[i]=(int)(Math.random()*10)+1;  //1~10�� ���ڸ� ������� �迭�� �ִ´�.
		}
		System.out.println(Arrays.toString(iArr1));
		
		for (int i =0; i<iArr1.length; i++) 
			tmp[i]= iArr1[i];
		System.out.println(Arrays.toString(tmp));
			
		iArr1 = tmp;
		System.out.println(Arrays.toString(iArr1));
	}

}
