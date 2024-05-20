package iesam.digitallibrary;

import java.util.Scanner;

import static iesam.digitallibrary.user.presentation.UserPresentation.userMenu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int select=-1;
            while(select!=0) {
                System.out.println("------------------------------------------------");
                System.out.println("---------------MENÚ PRINCIPAL------------------");
                System.out.println("------------------------------------------------");
                System.out.println("\t [1] MENÚ USUARIO");
                System.out.println("\t [0] SALIR");
                System.out.println("-----------------------------------------------");
                select = sc.nextInt();
                switch (select) {
                    case 0:
                        break;
                    case 1:
                        userMenu();
                    default:
                        System.out.println("Esta opción no está disponible");
                }
            }
        }
}