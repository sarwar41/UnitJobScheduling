
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		String resp = Utils.loadUserloggedInData() ;
		if (!resp.isEmpty()) {
			Home hm = new Home();
			hm.setVisible(true);
		} else {
			SignIn si = new SignIn();
			si.setVisible(true);
		}
	}	
}
