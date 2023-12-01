import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class Utils {

	public Utils() {

	}

	// email check
	public static boolean isEmailValid(String email) {

		try {
			String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
			Pattern pattern = Pattern.compile(EMAIL_REGEX);

			Matcher matcher = pattern.matcher(email);
			return matcher.matches();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	//
	public void saveUserloggedInData(String user_id) {
		try (OutputStream output = new FileOutputStream("localStorage.properties")) {
			Properties properties = new Properties();
			properties.setProperty("user_id", user_id);
			properties.store(output, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String loadUserloggedInData() {
		Properties properties = new Properties();
		File file = new File("localStorage.properties");

		if (file.exists()) {
			try (InputStream input = new FileInputStream(file)) {
				properties.load(input);
				return properties.getProperty("user_id", "");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File does not exist. Returning empty data.");
		}
		return properties.getProperty("data", "");

	}

}
