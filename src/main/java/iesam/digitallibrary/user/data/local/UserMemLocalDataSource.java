package iesam.digitallibrary.user.data.local;

import iesam.digitallibrary.user.domain.User;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserMemLocalDataSource {
    private static UserMemLocalDataSource userMemLocalDataSource=null;
    public static UserMemLocalDataSource newInstance(){
        if(userMemLocalDataSource ==null){
            userMemLocalDataSource= new UserMemLocalDataSource();
        }
        return userMemLocalDataSource;
    }
    private Map<String, User> dataStore = new TreeMap<>();

    public void save(User model) {
        dataStore.put(model.getDni(), model);
    }

    public void saveList(List<User> models) {
        for (User demo : models) {
            save(demo);
        }
    }

    public User findById(String id) {
        return dataStore.get(id);
    }

    public List<User> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }
}
