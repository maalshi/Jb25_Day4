import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int n = 0;
		int k = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �������");
		n = sc.nextInt();
		System.out.println("������� ����� k");
		k = sc.nextInt();
		
		int[] array;
		array = new int[n];
		
		Random rand = new Random();
		System.out.println("�������� �������: ");
		for (int i = 0; i<array.length; i++){
			
			array[i] = rand.nextInt(100);
			System.out.println(array[i]);

		if (array[i]%k==0){
			sum = sum +array[i];
			
			}
		}
		System.out.println("�����: " + sum);
		
	}

}
