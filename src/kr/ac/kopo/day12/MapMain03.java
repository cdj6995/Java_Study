package kr.ac.kopo.day12;

public class MapMain03 {

	public static void main(String[] args) {
		
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		
//		String s01 = new String("hello");
//		String s02 = new String("hello");
//		
		if(m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m1 != m2");
		}
	}
}