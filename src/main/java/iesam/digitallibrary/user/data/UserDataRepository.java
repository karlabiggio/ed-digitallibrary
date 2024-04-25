package iesam.digitallibrary.user.data;

import iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import iesam.digitallibrary.user.domain.User;
import iesam.digitallibrary.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {

    private UserFileLocalDataSource localDataSource;

    public UserDataRepository(UserFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public void saveUser(User user) {
        localDataSource.save(user);
    }

    @Override
    public void deleteUser(String id) {
        localDataSource.delete(id);
    }

    @Override
    public void updateUser(User user) {
        localDataSource.update(user);

    }
}

