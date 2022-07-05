package calc;

public class Calculator {
	public static int run(String s) {
		boolean isMinus = s.indexOf(" - ") != -1;
		
		if(isMinus) {
			return runMinus(s);
		}
		return runPlus(s);
	}

	private static int runPlus(String s) {
		String[] ss = s.split(" \\+ ");
		int no1 = Integer.parseInt(ss[0]);
		int no2 = Integer.parseInt(ss[1]);
		return no1+no2;
	}

	private static int runMinus(String s) {
		String[] ss = s.split(" \\- ");
		int no1 = Integer.parseInt(ss[0]);
		int no2 = Integer.parseInt(ss[1]);
		return no1-no2;
	}
}