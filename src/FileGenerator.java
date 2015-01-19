import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileGenerator {

	public static void main(String[] args) throws IOException {

		FileOutputStream out = null;

		out = new FileOutputStream("in");

		int startMemberKey = 10000000;
		int size = 3000000;
		Random random = new Random();
		for (int i = startMemberKey; i < startMemberKey +  size; i++) {
			int randomScore = random.nextInt(size * 10);
			String message = "" + i + ", " + randomScore + "\n" ;
			out.write(message.getBytes());
		}
		out.close();
	}

}
