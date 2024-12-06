package model;

public class Client extends User {

    public Client(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public String accountType() {
        return "client";
    }


}
