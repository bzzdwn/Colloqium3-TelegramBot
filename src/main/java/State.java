
public abstract class State {
    TelegramBot bot;

    State(TelegramBot bot) {
        this.bot = bot;
    }

    public abstract void sendMessage();
    public abstract void sendPicture();
    public abstract void sendVideo();
    public abstract void turnOff();
    public abstract void turnOn();
}
