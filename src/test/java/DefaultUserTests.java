import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class DefaultUserTests {
    @Test
    public void AuthorizationTest1() throws IOException {
        TelegramBot telegramBot = new TelegramBot();
        User user = new DefaultUser();
        Assert.assertEquals(user.tryToAuthorize("user3", "321"), true);
    }
    @Test
    public void AuthorizationTest2() throws IOException {
        TelegramBot telegramBot = new TelegramBot();
        User user = new DefaultUser();
        Assert.assertEquals(user.tryToAuthorize("admin", "123"), false);
    }
}
