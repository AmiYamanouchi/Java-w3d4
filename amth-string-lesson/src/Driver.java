
public class Driver {

	public static void main(String[] args) {
		// Math.randomはdoubleタイプだから、少数をなくすintにしたい場合は最初に(int)つける
//		for(int i = 0 ; i < 5; i++) {
//			int randNum = (int)((Math.random() * 10) + 5); //最後の５は最小数にしたい数字これだと５−１０
//			System.out.println(randNum);
//		}
//		
//		double num = 123.45678;
//		System.out.println((int)num);
		
		String s1 = "Hello";
		String s2 = "hello";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));

	}

}
