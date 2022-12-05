public class WorkingState extends State{

    WorkingState(TelegramBot bot) {
        super(bot);
    }


    @Override
    public void sendMessage() {
        System.out.println( "This message is so interesting!");
    }

    @Override
    public void sendPicture() {
        System.out.println("Very exciting picture!");
    }

    @Override
    public void sendVideo() {
        System.out.println( "So fascinating video! <#");
    }

    @Override
    public void turnOff() {
        bot.changeState(new OffState(bot));
            System.out.println("Bot is stopped its work.");
    }

    @Override
    public void turnOn() {
        if (!bot.isWorking()) {
            bot.changeState(new WorkingState(bot));
            System.out.println("Bot is working now.");
        } else {
            System.out.println("Bot is already working.");
        }
    }
}

