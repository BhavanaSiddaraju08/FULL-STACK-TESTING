package subtest9;

import org.testng.annotations.DataProvider;

public class dataprovider {
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][]{
                {"Bhavana", "S", "bha@gmail.com", "9846342765", "hii"},

        };
    }
}
