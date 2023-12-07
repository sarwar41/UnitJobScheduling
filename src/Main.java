import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Utils utils = new Utils();
		String resp = null ;
		try {
			resp = utils.loadUserloggedInData();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as needed
        }
		
		if (!resp.isEmpty()) {
			Home hm = new Home();
			hm.setVisible(true);
		} else {
			SignIn si = new SignIn();
			si.setVisible(true);
		}

	}
}
