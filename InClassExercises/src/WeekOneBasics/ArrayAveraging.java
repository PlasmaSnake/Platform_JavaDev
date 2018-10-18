package WeekOneBasics;

public class ArrayAveraging {
	public static void main(String[] args) {
		int[] numList = {1,8,4,6,10,27,11};
		int result = 0;
		for(int x: numList) result += x;
		System.out.printf("%.2f",(double)result/numList.length);
	}
}
