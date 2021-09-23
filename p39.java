import java.util.*;

public class p39 {
	public static void main(String[] args) {
		int max_solutions = 0;
		int max_p = 1;
		for (int p = 1; p < 1000; p++) {
			int amount_of_solutions = 0;
			for (int a = 1; a < p/2; a++) {
				for (int b = 1; b <= a; b++) {
					int c = p - a - b;
					if(isPithagorian(c,b,a)) {
						amount_of_solutions++;
						break;
					}
				}
			}
			if(amount_of_solutions > max_solutions) {
				max_solutions = amount_of_solutions;
				max_p = p;	
			}
		}
		System.out.println(max_p + "\t" + max_solutions);

	}


	static boolean isPithagorian(int a,int b, int c)
	{
		if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
			return true;
		return false;
	}
}