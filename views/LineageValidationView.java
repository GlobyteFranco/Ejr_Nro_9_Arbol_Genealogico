package views;

import java.util.Scanner;

import controllers.FamilyTreeController;
import models.FamilyTree;

public class LineageValidationView {
    FamilyTreeController familyController;
    Scanner scanner;

    public LineageValidationView(FamilyTreeController familyController, Scanner scanner) {
        this.familyController = familyController;
        this.scanner = scanner;
    }

    public void startEnteringData() {
        System.out.println(
                "A continuacion ingrese sus datos y luego los datos de su padre, madre, abuelo, bisabuelo y antepasados... \n Si quiere finalizar la entrada de datos tipe un caracter en el DNI...\n\n");
        while (true) {
            System.out.println("Ingresar DNI...");
            int dni;
            try {
                dni = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(
                        "Programa finalizado, muchas gracias probarlo!!\n A continuacion se validara su nacionalidad");
                checkNationality();
                break;
            }

            System.out.println("Ingresar Nombre...");
            String name = scanner.nextLine();
            System.out.println("Ingresar Apellido...");
            String lastName = scanner.nextLine();
            System.out.println("Ingresar Nacionalidad...");
            String Nationalitie = scanner.nextLine();
            familyController.enterDataController(dni, name, lastName, Nationalitie);
        }

    }

    public void checkNationality() {
        if (familyController.checkLineage()) {
            System.out.println("Felicidades sos tano!!!");
        } else {
            System.out.println("Mal ahi wachin, no sos tano");

        }
    }
}
