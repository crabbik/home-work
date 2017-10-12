package by.itakademy.lg.task30;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {

	public static void main(String[] args) throws IOException {
		File file = new File("d:/students/JavaJD1/task30.txt");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Ви́кинги — канадо-ирландский исторический сериал, созданный Майклом Хёрстом специально для телеканала History, "
						+ "премьера которого состоялась 3 марта 2013 года ");
		fileWriter.close();
		List<String> allLines = Files.readAllLines(Paths.get(file.getAbsolutePath()), Charset.defaultCharset());
		for (String line : allLines) {
			System.out.println(line);
		}
		int countWords =0;
		int countMark =0;
		for (String word : allLines) {
			String [] wordResult =word.split("( |,-)+");
			countWords +=wordResult.length;

			Pattern p = Pattern.compile("(-|,)");
			Matcher matcher = p.matcher(word);
			while (matcher.find()){
				countMark++;
			}
		}
		System.out.println("words: "+ countWords);
		System.out.println("Mark: "+ countMark);

	}

}
