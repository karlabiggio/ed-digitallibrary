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
    public static void userMenu() {
        int select=-1;
        while(select!=0) {
            System.out.println("------------------------------------------------");
            System.out.println("---------------MENÚ DE USUARIO------------------");
            System.out.println("------------------------------------------------");
            System.out.println("\t [1] Registrar Usuario");
            System.out.println("\t [2] Actualizar Usuario");
            System.out.println("\t [3] Eliminar Usuario");
            System.out.println("\t [0] Salir");
            System.out.println("-----------------------------------------------");
            select = sc.nextInt();
            switch (select) {
                case 0:
                    break;
                case 1:
                    newUser();
                case 2:
                    updateUser();
                case 3:
                    deleteUser();
            }
        }
    }
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
