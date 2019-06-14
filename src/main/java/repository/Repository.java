package repository;

public class Repository {

    private static Repository instance;

    public static Repository getInstance() {
        if(instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public String login(String username, String password) {


        return "";
    }


}
