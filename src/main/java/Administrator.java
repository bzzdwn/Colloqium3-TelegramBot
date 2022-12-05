import java.util.Scanner;

public class Administrator implements User {
    String login = "admin";
    String password = "00000";
    boolean authorized = false;
    @Override
    public boolean tryToAuthorize(String login, String password){
        if (login.equals(login) && password.equals(this.password)){
            System.out.println("Authorization successful!");
            authorized = true;
            return true;
        } else {
            System.out.println("Authorization unsuccessful.");
            return false;
        }
    }
    @Override
    public void sendPicture() {
        if (authorized)
            Main.telegramBot.getState().sendPicture();
        else System.out.println("You don't have permission to do this, please authorize");
    }

    @Override
    public void sendMessage() {
        if (authorized)
            Main.telegramBot.getState().sendMessage();
        else System.out.println("You don't have permission to do this, please authorize");
    }

    @Override
    public void sendVideo() {
        if (authorized)
            Main.telegramBot.getState().sendVideo();
        else System.out.println("You don't have permission to do this, please authorize");

    }

    @Override
    public boolean authorization() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input username:");
        String username = scanner.nextLine();
        System.out.println("Input password:");
        String password = scanner.nextLine();
        if (username.equals(login) && password.equals(this.password)){
            System.out.println("Authorization successful!");
            authorized = true;
            return true;
        } else {
            System.out.println("Authorization unsuccessful.");
            return false;
        }
    }

    @Override
    public void switchOn() {
        if (authorized)
            Main.telegramBot.getState().turnOn();
        else System.out.println("You don't have permission to do this, please authorize");
    }

    @Override
    public void switchOff() {
        if (authorized)
            Main.telegramBot.getState().turnOff();
        else System.out.println("You don't have permission to do this, please authorize");
    }
}
