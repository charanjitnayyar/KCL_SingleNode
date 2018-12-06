import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;

enum SuffixVal {
	f(-15), p(-12), n(-9), u(-6), m(-3), k(3), K(3), M(6), G(9), T(12);

	int value;

	public int getVal() {
		return this.value;
	}

	SuffixVal(int value) {
		this.value = value;
	}
}

public class metric_conv {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number in any desired format");

		String n = input.nextLine();
		double result = suffixVal(n);

		System.out.println(result);

	}
	public static double suffixVal(String s) {
		char suffix = s.charAt(s.length() - 1);			//get last letter
		if(suffix >= 48 && suffix <= 57)				//get rest of the number
			return Double.parseDouble(s);
		else {
			double prefix = (s.length() > 2)?(Double.parseDouble(s.substring(0,s.length()-1))):((int)(Character.getNumericValue(s.charAt(0))));
			int ten_exp;
			switch (suffix) {
				case 'f' : ten_exp = SuffixVal.f.value;
				break;
				case 'p' : ten_exp = SuffixVal.p.value;
				break;
				case 'n' : ten_exp = SuffixVal.n.value;
				break;
				case 'u' : ten_exp = SuffixVal.u.value;
				break;
				case 'm' : ten_exp = SuffixVal.m.value;
				break;
				case 'k' : ten_exp = SuffixVal.k.value;
				break;
				case 'K' : ten_exp = SuffixVal.K.value;
				break;
				case 'M' : ten_exp = SuffixVal.M.value;
				break;
				case 'G' : ten_exp = SuffixVal.G.value;
				break;
				case 'T' : ten_exp = SuffixVal.T.value;
				break;
				default  : ten_exp = 0;
				break;
			}
			//System.out.println("prefix = "+prefix);
			double result = prefix*Math.pow(10,ten_exp);
			return result;
			}

		}
}



