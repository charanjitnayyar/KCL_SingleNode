import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;
// one class needs to have a main() method
public class KCL_SingleNode
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Number of wires = ?");
    int n = input.nextInt();
    double res[] = new double[n];
    double volt[] = new double[n];
    int i;
    for (i=1;i<=n;i++) {
      System.out.println("Enter voltage "+i );
      volt[i-1] = input.nextDouble();
      System.out.println("Enter resistance from node to voltage:");
      res[i-1] = input.nextDouble();
    }
    double resprod = 1;
    
    for(i=0;i<n;i++) {
      resprod *= res[i];    
    }
    double qsum = 0;
    double dsum = 0;
    for (i=0;i<n;i++) {
      dsum += (resprod/res[i]);
      qsum += (volt[i]*(resprod/res[i]));
    }
    double val = qsum/dsum;
    
    System.out.println("Voltage value = "+val);
  }
}
