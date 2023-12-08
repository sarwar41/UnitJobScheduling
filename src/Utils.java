
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Utils {

	public Utils() {

	}

	// email check
	public boolean isEmailValid(String email) {

		String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	//
	public static void saveUserloggedInData(String user_id) throws IOException {
		try (OutputStream output = new FileOutputStream("localStorage.properties")) {
			Properties properties = new Properties();
			properties.setProperty("user_id", user_id);
			properties.store(output, null);
		}
	}

	public String loadUserloggedInData() throws IOException {
		Properties properties = new Properties();
		File file = new File("localStorage.properties");

		try (InputStream input = new FileInputStream(file)) {
			properties.load(input);
			return properties.getProperty("user_id", "");
		}
	}

}
