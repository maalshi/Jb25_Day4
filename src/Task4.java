import java.util.Random;


public class Task4 {


	public static void main(String[] args) {
		 int n = 1000;
		 int [] generalArray;
		 generalArray = new int [n]; //�������������� ������ ������
		 
		 int [] nullArray; //������, � ������� ����� ����
		 int nulls = 0; //���������� ������� ���������� �����
		 
		 //��������� ������
		 Random rand = new Random();
		 for (int i =0;i<generalArray.length;i++){
			 generalArray[i] = rand.nextInt(100);
		 }
		 
		 //�������� ���� �� �������
		 for(int i1 = 0; i1 <generalArray.length; i1++){
			 if (generalArray[i1]==0){
				 nulls++;
			 }
			 
		 }
		 //������� ������ �����
			 nullArray = new int[nulls];
			 System.out.println("������ nulls ������� �� " +nulls+" ���������.");
			 for (int i2 = 0;i2<nullArray.length;i2++){
				 nullArray[i2] = 0;
				 
				 System.out.println("������� �������: [" + i2 + "], �������� �������: " + nullArray[i2]);
			 }
		 }
	
}
