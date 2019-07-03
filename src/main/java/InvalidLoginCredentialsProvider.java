import org.testng.annotations.DataProvider;

public class InvalidLoginCredentialsProvider {

    @DataProvider(name = "credentials")
    private Object[][] credentials(){
        return new Object[][] {
                {"testseavusassignment@gmail.com", "Zlaja20"},
        };
    }
}
