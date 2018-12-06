import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;

public class top_metric_conv {
	public static void main(String[] args) {

		metric_conv convert = new metric_conv();

		//base case (unrelated) without decimal
		System.out.println(convert.suffixVal("123456"));
		
		//base case (unrelated) with decimal
		System.out.println(convert.suffixVal("123.456"));

		//case k
		System.out.println(convert.suffixVal("123.456k"));

		//case m
		System.out.println(convert.suffixVal("123456m"));

		//case M
		System.out.println(convert.suffixVal("0.123456M"));








	}




}