import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ RegressionTest.class, RegressionTest0.class, RegressionTest1.class, UtilsTest.class })
public class BlackBoxTesting {

}
