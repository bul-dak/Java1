
public class Ex06 { //�Ҽ��� ��° �ڸ����� �ݿø��ϴ� �ڵ�

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = 5/9f * (fahrenheit-32);
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);

		celcius = (5/9f * (fahrenheit-32))*100;
		celcius = (5/9f * (fahrenheit-32))*(100)+0.5f;
		celcius = (int)((5/9f * (fahrenheit-32))*(100)+0.5f);
		celcius = (int)((5/9f * (fahrenheit-32))*(100)+0.5f)/100f;
				
		System.out.println("Celcius:"+celcius);
	}

}
