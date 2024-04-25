package iesam.digitallibrary.user.domain;

public class NewUserUseCase {
    private UserRepository userRepository;
    public NewUserUseCase (UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void execute(User user) {
        userRepository.saveUser(user);
    }
}
