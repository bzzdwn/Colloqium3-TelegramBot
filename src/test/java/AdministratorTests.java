import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AdministratorTests {
    @Test
    public void AuthorizationTest1() throws IOException {
        TelegramBot telegramBot = new TelegramBot();
        User user = new Administrator();
        Assert.assertEquals(user.tryToAuthorize("admin", "00000"), true);
    }
    @Test
    public void AuthorizationTest2() throws IOException {
        TelegramBot telegramBot = new TelegramBot();
        User user = new Administrator();
        Assert.assertEquals(user.tryToAuthorize("admin", "123"), false);
    }
}
