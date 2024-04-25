package iesam.digitallibrary.user.presentation;

import iesam.digitallibrary.user.data.UserDataRepository;
import iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import iesam.digitallibrary.user.domain.DeleteUserUseCase;
import iesam.digitallibrary.user.domain.NewUserUseCase;
import iesam.digitallibrary.user.domain.UpdateUserUseCase;
import iesam.digitallibrary.user.domain.User;

import java.util.Scanner;

public class UserPresentation {
    static Scanner sc = new Scanner(System.in);
    public static void newUser() {
        System.out.println("Introduce el ID");
        String id = sc.nextLine();
        System.out.println("Introduce el dni");
        String dni = sc.nextLine();
        System.out.println("Introduce el nombre");
        String name = sc.nextLine();
        System.out.println("Introduce el apellido");
        String surname = sc.nextLine();
        System.out.println("Introduce la fecha de hoy");
        String expeditionDate = sc.nextLine();

        User newUser = new User(id, dni, name, surname, expeditionDate);
        NewUserUseCase newUserUseCase = new NewUserUseCase(new UserDataRepository(new UserFileLocalDataSource()));
        newUserUseCase.execute(newUser);
    }
    public static void deleteUser() {
        System.out.println("Introduce el ID");
        String id = sc.nextLine();
        DeleteUserUseCase deleteUserUseCase = new DeleteUserUseCase(new UserDataRepository(new UserFileLocalDataSource()));
        deleteUserUseCase.execute(id);
    }

    public static void updateUser() {
        System.out.println("Introduce el ID");
        String id = sc.nextLine();
        System.out.println("Introduce el dni");
        String dni = sc.nextLine();
        System.out.println("Introduce el nombre");
        String name = sc.nextLine();
        System.out.println("Introduce el apellido");
        String surname = sc.nextLine();
        System.out.println("Introduce la fecha de hoy");
        String expeditionDate = sc.nextLine();

        User newUser = new User(id, dni, name, surname, expeditionDate);
        UpdateUserUseCase updateUserUseCase = new UpdateUserUseCase(new UserDataRepository(new UserFileLocalDataSource()));
        updateUserUseCase.execute(newUser);
    }
}
