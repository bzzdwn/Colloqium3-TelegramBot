public class Main {
    public static TelegramBot telegramBot = new TelegramBot();
    private static User user;

    public static void main(String[] args) {
        user = new BlockedUser();
        telegramBot.authorize(user);
        telegramBot.switchOff(user);
        telegramBot.sendMessage(user);
        telegramBot.switchOn(user);
        telegramBot.sendVideo(user);
    }
}
