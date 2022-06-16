package examenUsers.dao;

public class User {
    private String fullName;
    private int age;
    private String email;
    private String gender;

    public User(String fullName, int age, String email, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Usuario: %s, de edad %d%nCorreo electrónico: %s y género %S%n",
                fullName, age, email, gender);
    }
}
