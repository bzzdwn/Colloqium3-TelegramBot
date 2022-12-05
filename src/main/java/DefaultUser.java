import java.util.ArrayList;
import java.util.Scanner;

public class DefaultUser implements User {
    private static ArrayList<UserType> data_base = new ArrayList<UserType>();
    static {
        data_base.add(new UserType("user1", "12345"));
        data_base.add(new UserType("user2", "54321"));
        data_base.add(new UserType("user3", "321"));
        data_base.add(new UserType("user5", "1111"));
        data_base.add(new UserType("user6", "0000"));
    };
    boolean authorized = false;
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

    private boolean FindUserInBase(String id, String password) {
        UserType user = new UserType(id, password);
        for (int i = 0; i < data_base.size(); i++) {
            if (user.getId().equals(data_base.get(i).getId()) &&
                    user.getPassword().equals(data_base.get(i).getPassword()))
                return true;
        }
        return false;
    }
    @Override
    public boolean tryToAuthorize(String login, String password){
        if (FindUserInBase(login, password)){
            System.out.println("Authorization successful!");
            authorized = true;
            return true;
        } else {
            System.out.println("Authorization unsuccessful.");
            return false;
        }
    }
    @Override
    public boolean authorization() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input username:");
        String id = scanner.nextLine();
        System.out.println("Input password:");
        String password = scanner.nextLine();
        if (FindUserInBase(id, password)){
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
            System.out.println("You don't have permission to do this.");
        else System.out.println("You don't have permission to do this, please authorize");
    }

    @Override
    public void switchOff() {
        if (authorized)
            System.out.println("You don't have permission to do this.");
        else System.out.println("You don't have permission to do this, please authorize");
    }
}
