package kr.ac.kopo.day10.inter;

public class SamsungTV implements TV {

	
	
	public SamsungTV() {
		System.out.println("삼성TV를 구매했습니다.");
	}

	@Override
	public void powerOn() {
		System.out.println("TV 전원 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원 OFF");
	}

	@Override
	public void channerlUp() {
		System.out.println("Channel UP");
	}

	@Override
	public void channerlDown() {
		System.out.println("Channel DOWN");
	}

	@Override
	public void volumeUp() {
		System.out.println("VOLUME UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("VOLUME DOWN");
	}

	@Override
	public void mute() {
		System.out.println("MUTE...");

	}

}
