import java.util.Random;


public class Task4 {


	public static void main(String[] args) {
		 int n = 1000;
		 int [] generalArray;
		 generalArray = new int [n]; //инициализируем первый массив
		 
		 int [] nullArray; //массив, в котором будут нули
		 int nulls = 0; //переменная считает количество нулей
		 
		 //заполняем массив
		 Random rand = new Random();
		 for (int i =0;i<generalArray.length;i++){
			 generalArray[i] = rand.nextInt(100);
		 }
		 
		 //выбираем нули из массива
		 for(int i1 = 0; i1 <generalArray.length; i1++){
			 if (generalArray[i1]==0){
				 nulls++;
			 }
			 
		 }
		 //создаем массив нулей
			 nullArray = new int[nulls];
			 System.out.println("Массив nulls состоит из " +nulls+" элементов.");
			 for (int i2 = 0;i2<nullArray.length;i2++){
				 nullArray[i2] = 0;
				 
				 System.out.println("Элемент массива: [" + i2 + "], значение массива: " + nullArray[i2]);
			 }
		 }
	
}
