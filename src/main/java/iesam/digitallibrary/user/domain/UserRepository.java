package iesam.digitallibrary.user.domain;

public interface UserRepository {
    void saveUser(User user);
    void deleteUser(String id);
    void updateUser(User user);
}
