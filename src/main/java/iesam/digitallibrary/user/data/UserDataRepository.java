package iesam.digitallibrary.user.data;

import iesam.digitallibrary.user.data.local.DataSourceRepository;
import iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import iesam.digitallibrary.user.domain.User;
import iesam.digitallibrary.user.domain.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserDataRepository implements UserRepository {

    private DataSourceRepository dataSourceRepository;

    public UserDataRepository(UserFileLocalDataSource dataSourceRepository) {
        this.dataSourceRepository = dataSourceRepository;
    }

    @Override
    public void saveUser(User user) {
        dataSourceRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
        dataSourceRepository.delete(id);
    }

    @Override
    public void updateUser(User user) {
        dataSourceRepository.save(user);
    }
    public ArrayList<User> obtains() {
        List<User> users = dataSourceRepository.findAll();
        return null;
    }
    public User obtain(String id) {
        return dataSourceRepository.findById(id);
    }
}

