package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV{
	@Autowired
//	@Qualifier("sony")
	private Speaker speaker;
	private double price;
	
	public LgTV() {System.out.println("LgTV생성자");}
	public LgTV(Speaker speaker, double price) {
		System.out.println("LgTV생성자(2)");
		this.speaker = speaker;
		this.price = price;
		}
	
	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다.");
//		System.out.printf("price : %.2f%n",price);
	}
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("LgTV --- 소리 올린다..");
//		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("LgTV --- 소리 내린다..");
//		speaker.volumeDown();
	}
}
