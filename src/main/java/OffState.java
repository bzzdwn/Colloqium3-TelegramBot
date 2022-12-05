public class OffState extends State{

        OffState(TelegramBot bot) {
            super(bot);
            bot.turnOn(false);
        }


    @Override
    public void sendMessage() {
        System.out.println( "...");
    }

    @Override
    public void sendPicture() {
        System.out.println( "...");
    }

    @Override
    public void sendVideo() {
        System.out.println( "...");
    }

    @Override
    public void turnOff() {
        if (bot.isWorking()) {
            bot.changeState(new OffState(bot));
            System.out.println( "Bot is stopped.");
        } else {
            System.out.println( "Bot is already stopped.");
        }
    }

    @Override
    public void turnOn() {
        bot.changeState(new WorkingState(bot));
        System.out.println( "Bot is working!");
    }
}



