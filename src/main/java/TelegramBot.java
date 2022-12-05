import java.util.ArrayList;
import java.util.List;

public class TelegramBot {
    private State state;
    private boolean working = false;

    public TelegramBot() {
        this.state = new WorkingState(this);
        turnOn(true);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void turnOn(boolean isOn) {
        this.working = isOn;
    }

    public void switchOn(User user){
        user.switchOn();
    }

    public void sendMessage(User user){
        user.sendMessage();
    }

    public void sendPicture(User user){
        user.sendPicture();
    }

    public void sendVideo(User user){
        user.sendVideo();
    }
    public void switchOff(User user){
        user.switchOff();
    }

    public void authorize(User user){
        while(user.authorization() == false){
            System.out.println("Try another one.");
        }
    }

    public boolean isWorking() {
        return working;
    }

}
