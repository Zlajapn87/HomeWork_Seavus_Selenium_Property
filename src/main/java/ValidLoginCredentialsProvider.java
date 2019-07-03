import org.testng.annotations.DataProvider;

public class ValidLoginCredentialsProvider {

    @DataProvider(name = "credentials")
    private Object[][] credentials(){
            return new Object[][] {
            {"testseavusassignment@gmail.com", "Zlaja2019"},
        };
    }
}
