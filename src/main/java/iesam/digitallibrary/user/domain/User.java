package iesam.digitallibrary.user.domain;

public class User {
    public final String id;
    public final String dni;
    public final String name;
    public final String surname;
    public final String expeditionDate;

    public User(String id, String dni, String name, String surname, String expeditionDate) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.expeditionDate = expeditionDate;
    }

    public String getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getExpeditionDate() {
        return expeditionDate;
    }
}
