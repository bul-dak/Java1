
public class Ex03 { //int �迭 10�� �������� �Է¹޾Ƽ� ���հ� ��� ���ϱ�

	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;
		double aver =0;
		
			for(int i=0;i<10;i++) {
				score[i]=(int)(Math.random()*100)+1;
				sum += score[i];
			} 
			aver = sum/10.0;
			
//			for(int i=0;i<10;i++) {  ���� ���ϰ� �и����ѵ� ��.
//				sum += score[i];
				
		System.out.println("sum: "+sum);
		System.out.println("aver: "+aver);
		System.out.println("aver: "+(double)sum/score.length); //aver������ϰ� �̷��� �ص� ��!
			
	}

}
