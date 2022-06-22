package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker{
	
	
	public AppleSpeaker() {
		System.out.println("Apple Speaker 생성자");
	}
	@Override
	public void volumeUp() {
		System.out.println("Apple Speaker 소리울린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("Apple Speaker 소리내린다.");
	
	}

}
