
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

public class Utils {
	
	// email check
	public static boolean isEmailValid(String email) {
		String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	// save data to local file
	public static void saveUserloggedInData(String user_id) throws IOException {
		try (OutputStream output = new FileOutputStream("localStorage.properties")) {
			Properties properties = new Properties();
			properties.setProperty("user_id", user_id);
			properties.store(output, null);
		}
	}
	// load data to local file
	public static String loadUserloggedInData() {
		Properties properties = new Properties();
		File file = new File("localStorage.properties");
		try (InputStream input = new FileInputStream(file)) {
			properties.load(input);
			return properties.getProperty("user_id", "");
		} catch (IOException ex) {
			return ex.getMessage();
		}
	}
	// hash password
	public static String passwordHashing(String password) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hashedBytes = digest.digest(password.getBytes());

			// Convert the byte array to a hexadecimal string
			StringBuilder hexString = new StringBuilder();
			for (byte b : hashedBytes) {
				String hex = Integer.toHexString(0xff & b);
				if (hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
			return hexString.toString();

		} catch (Exception e) {
			return "";
		}
	}
}
