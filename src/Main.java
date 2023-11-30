
public class Main {
	public static void main(String[] args)
    {
		Utils utils = new Utils();
		String resp = utils.loadUserloggedInData();
		if( resp.equals("yes")) {
			Home hm=new Home();
			hm.setVisible(true);
		}else {
			SignUp su = new SignUp();
			su.setVisible(true);
		}
    	
    	
    }
}
