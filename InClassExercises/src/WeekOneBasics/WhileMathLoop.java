package WeekOneBasics;

public class WhileMathLoop {

	public static void main(String[] args) {
		int i = 0, result = 0;
		while(i < 7) {
			result = (int)Math.pow(3,i);
			System.out.print(result+ " ");
			i++;
		}
		System.out.println();
		int j = 2;
		while (j < 163){
			System.out.println(j);
			j*=3;
		}

	}

}
