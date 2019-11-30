package JDBC.domain;

public class User {
    private String name;
    private String password;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getUsername() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassWord(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "[" + "name:" + name + "," + "password:" + password + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return this.name.equals(user.name) && this.password.equals(user.password);
        }
        return false;
    }

}
