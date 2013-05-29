import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Driver {

	public static void main(String[] args) throws IOException {

		User user = new User();
		user.setUsername("naironics");
		user.setPassword("mypass");

		File file = new File("/home/naironics/serialtest.txt");
		OutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutput outputStream = new ObjectOutputStream(fileOutputStream);
		outputStream.writeObject(user);
		System.out
				.println("I have successfully stored the User object into the file: "
						+ file.getName());
	}

}
