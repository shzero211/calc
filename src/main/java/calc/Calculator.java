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
		int sum=0;
		for(int i=0;i<ss.length;i++) {
			sum+=Integer.parseInt(ss[i]);
		}
		return sum;
		
	}

	private static int runMinus(String s) {
		String[] ss = s.split(" \\- ");
		int num=Integer.parseInt(ss[0]);
		for(int i=1;i<ss.length;i++) {
			num-=Integer.parseInt(ss[i]);
		}
		return num;
	}
}