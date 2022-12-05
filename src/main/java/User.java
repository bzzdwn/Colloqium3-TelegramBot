public interface User {
    void sendPicture();
    void sendMessage();
    void sendVideo();
    boolean authorization();
    void switchOn();
    void switchOff();
    boolean tryToAuthorize(String login, String password);
}
