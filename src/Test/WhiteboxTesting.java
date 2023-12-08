package Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ DataAccessTest.class, HomeTest.class, SignInTest.class, SignUpTest.class, UserProfileTest.class,
		UtilsTest.class })
public class WhiteboxTesting {

}
