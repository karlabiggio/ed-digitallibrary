package iesam.digitallibrary.user.data.local;

import iesam.digitallibrary.user.domain.User;

import java.util.List;

public interface DataSourceRepository {
    void save (User model);
    void saveList(List<User> models);
    User findById(String id);
    List<User> findAll();
    void delete(String modelId);
}
