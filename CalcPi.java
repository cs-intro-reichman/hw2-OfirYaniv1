// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int times = Integer.parseInt(args[0]);
		int first = 3;
		double symbol = -1.0;
		double last = 1.0;
		for(int i = 1; i < times; i++){
			last = last + ((1.0/first)*symbol);
			symbol = symbol * -1.0;
			first = first + 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + last * 4);
	}
}
