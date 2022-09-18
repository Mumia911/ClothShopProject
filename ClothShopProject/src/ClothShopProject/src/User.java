public class User {
    public Long id;
    public String login;
    public String password;

    public User(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password =  password;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
/*
public String getEmail() {
        return email;
    }
    public void setLogin(String login) {
        this.login = login;
    }
 */