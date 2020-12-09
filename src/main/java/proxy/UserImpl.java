package proxy;
/**
 * Пользователь
 */
 public class UserImpl implements User {

    @Override
    public void login() {
        System.out.println("login successfull");
    }

    @Override
    public void logout() {
        System.out.println("logout");
    }

    @Override
    public void showHomePage() {
        System.out.println("home page");
    }

}
