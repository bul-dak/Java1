
class Exercise {
	public static void main(String[] args) {
		SutaCard card1 = new SutaCard(3, false);
		SutaCard card2 = new SutaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
class SutaCard {
	int num;
	boolean isKwang;
	char ch;
	
	public SutaCard(int num, boolean isKwang) {
		if (1 <= num && num <=10) 
			this.num = num;
		else 
			this.num = 0;
		
		this.isKwang = isKwang;
	}	
	public SutaCard() { 
//		this.num=1;
//		this.isKwang = true;
		this(1,true); //������ �ȿ��� ���� �ΰ��� �����ϴ� �ٸ� 
		              //�����ڸ� ȣ���ؿ�.
	}
	
	String info() {
		return num+(isKwang? "K":"");
	}
}
