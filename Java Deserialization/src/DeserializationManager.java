import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationManager {

	public static void main(String[] args) {
		User object = null;
		File file = new File("/home/naironics/serialtest.txt");
		FileInputStream fIn = null;
		ObjectInputStream oIn = null;
		try {
			fIn = new FileInputStream(file);
			oIn = new ObjectInputStream(fIn);
			object = (User) oIn.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(object.getUsername());
		System.out.println(object.getPassword());

		System.out
				.println("I have successfully read the user object from the file :"
						+ file.getName());
	}
}