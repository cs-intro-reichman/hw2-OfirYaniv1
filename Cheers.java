
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            word = word.toUpperCase();
            int times = Integer.parseInt(args[1]);
            String problem = "AEFHILMNORSX";
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                int index = problem.indexOf(ch);
                if (index == -1) {
                    System.out.println("Give me a " + ch + ": " + ch + "!");    
                }
                else{
                        System.out.println("Give me an " + ch + ": " + ch + "!");
                }
            }
            for(int i = 0; i < times; i++){
                System.out.println(word + "!!!");
            }
        }
}
