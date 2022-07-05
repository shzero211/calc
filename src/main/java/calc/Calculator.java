package calc;

public class Calculator {
	public static int run(String s) {
		boolean isMinus = s.indexOf(" - ") != -1;
		boolean isPlus = s.indexOf(" + ") != -1;
		boolean isMul = s.indexOf(" * ") != -1;
		boolean isDiv = s.indexOf(" / ") != -1;
		if(isMul) {
			return runMul(s);
		}
		if(isDiv) {
			return runDiv(s);
		}
		if(isPlus) {
			return runPlus(s);
		}
		if(isMinus) {
			return runMinus(s);
		}
		return 0;
	}

	private static int runPlus(String s) {
		String[] ss = s.split(" \\+ ");
		int num=Integer.parseInt(ss[0]);
		for(int i=1;i<ss.length;i++) {
			num+=Integer.parseInt(ss[i]);
		}
		return num;
		
	}

	private static int runMinus(String s) {
		String[] ss = s.split(" \\- ");
		int num=Integer.parseInt(ss[0]);
		for(int i=1;i<ss.length;i++) {
			num-=Integer.parseInt(ss[i]);
		}
		return num;
	}
	
	private static int runMul(String s) {
		String[] ss = s.split(" \\* ");
		int num=Integer.parseInt(ss[0]);
		for(int i=1;i<ss.length;i++) {
			num*=Integer.parseInt(ss[i]);
		}
		return num;
	}
	private static int runDiv(String s) {
		String[] ss = s.split(" \\/ ");
		int num=Integer.parseInt(ss[0]);
		for(int i=1;i<ss.length;i++) {
			num/=Integer.parseInt(ss[i]);
		}
		return num;
	}
}