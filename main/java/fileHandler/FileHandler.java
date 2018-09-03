package fileHandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileHandler {
	private Path path;

	public FileHandler(String fileName) {
		File file = new File(fileName);
		if (file.isFile())
			path = Paths.get(fileName);
	}

	public ArrayList<Double> getValues() {
		ArrayList<Double> values = new ArrayList<Double>();
		try {
			BufferedReader bufferedReader = Files.newBufferedReader(path);
			String line = bufferedReader.readLine();

			while (line != null) {
				values.add(Double.valueOf(line));
				line = bufferedReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return values;
	}

}
