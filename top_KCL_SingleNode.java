
import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;

public class top_KCL_SingleNode {
	public static void main(String[] args){
		KCL_SingleNode kcl = new KCL_SingleNode();
		int n = 3;
		double res[] = {100,100,100};
		double volt[] = {5,3,5};
		double val = kcl.KCL_calc(n,res,volt);			//KCL.calc(n, res array, volt array)
		System.out.println(val);		
	}
}
