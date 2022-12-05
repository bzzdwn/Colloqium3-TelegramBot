import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BlockedUserTests {
    @Test
    public void AuthorizationTest1() throws IOException {
        TelegramBot telegramBot = new TelegramBot();
        User user = new BlockedUser();
        Assert.assertEquals(user.tryToAuthorize("user0", "2222"), true);
    }
    @Test
    public void AuthorizationTest2() throws IOException {
        TelegramBot telegramBot = new TelegramBot();
        User user = new BlockedUser();
        Assert.assertEquals(user.tryToAuthorize("user1", "1234"), false);
    }
}
