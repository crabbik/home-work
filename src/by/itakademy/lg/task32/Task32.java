package by.itakademy.lg.task32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Task32 {

	public static void main(String[] args) throws IOException {
		Random random = new Random();
		DataOutputStream a;
		try {
			a = new DataOutputStream(new FileOutputStream("d:/students/JavaJD1/task32.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return;

		}
		for (int i = 0; i < 20; i++) {
			a.writeInt(random.nextInt(10));
		}
		a.close();
		DataInputStream dataInputStream = new DataInputStream(
				new FileInputStream("d:/students/JavaJD1/task32.txt"));

		int sum =0;
	//	int count=0;
		while (dataInputStream.available() > 0) {
			int k = dataInputStream.readInt();
			sum +=k;
		//	count ++;
			
					System.out.print(k + " ");
		}
		
		dataInputStream.close();
		System.out.print(sum);

	}

}
