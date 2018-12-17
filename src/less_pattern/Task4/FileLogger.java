package less_pattern.Task4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLogger implements ILogger {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		try (
			FileOutputStream fos = new FileOutputStream (new File ("C:/test/FileLogger.txt")))
		{
			fos.write("!!FileLogger!!".getBytes());
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
