package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTV implements TV{
	@Autowired
//	@Qualifier("apple")
//	@Resource(name="sony")
	private Speaker speaker;
	private int price;
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("setPrice호출");
		this.price = price;
	}
	

	public SamsungTV() {
		System.out.println("samsungTV 객체 생성");
		}
	public SamsungTV(Speaker speaker) {
		System.out.println("samsungTV(2) 객체 생성");
		this.speaker = speaker;
		}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("samsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
		}
	
	void initMethod() {
		System.out.println("초기화 메소드");
	}
	
	public void powerOn() {
		System.out.print("SamsungTV --- 전원 켠다...");
//		System.out.printf("price : %d\n", price);
	}
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다...");
	}
	public void volumeUp() {
//		speaker = new SonySpeaker();
		speaker.volumeUp();
		System.out.println("SamsungTV --- 소리 올린다..");
	}
		public void volumeDown() {
//		speaker = new SonySpeaker();
		speaker.volumeDown();
		System.out.println("SamsungTV --- 소리 내린다..");
	}
}
