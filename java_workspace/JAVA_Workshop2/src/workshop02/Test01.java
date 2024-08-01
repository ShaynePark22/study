package workshop02;

public class Test01 {

	public static void main(String[] args) {
		int[] number = new int[3];
		int max = 0 ;
		int min = 0 ;
				
		System.out.print("입력값: ");
		for (int i = 0; i < args.length; i++) {
			number[i] = Integer.parseInt(args[i]);
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		max = Math.max(number[0], Math.max(number[1], number[2]));
		min = Math.min(number[0], Math.min(number[1], number[2]));
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	}

}
