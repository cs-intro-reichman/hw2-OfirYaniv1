// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int last = 0;
		int count = 1;
		if (mode.equals("v")) {
			for(int i = 1; i <= N; i++){
				last = i;
				System.out.print(last + " ");
				boolean finish = false;
				count = 1;
				while (finish == false) {
					if(last % 2 == 0){
						last = last / 2;
					}
					else{
						last = (last * 3) + 1;
					}
					System.out.print(last + " ");
					count++;
					if (last == 1) {
						finish = true;			
					}
				}
			System.out.println("(" + count + ")");
			}
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");


	}
}
