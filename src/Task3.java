import java.util.Random;


public class Task3 {

	public static void main(String[] args) {
		
		int[] array = new int[2];
		int decrease = 0;
		
		Random rand = new Random();
		for (int i = 0; i<array.length; i++){
			array[i] = rand.nextInt(20);
			System.out.println(array[i]);
		}
		
		for (int i1 = 0;i1< array.length - 1; i1++){
			if (array[i1]>array[i1+1]){
				decrease++;
			}
			
		}
		
		if (decrease<=0){
			System.out.println("Последовательность возрастающая");
		} else {System.out.println("Последовательность не возрастающая");}

	}

}
