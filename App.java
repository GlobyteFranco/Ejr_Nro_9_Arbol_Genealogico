import java.util.Scanner;

import controllers.FamilyTreeController;
import models.FamilyTree;
import views.LineageValidationView;

public class App {
    public static void main(String[] args) {
        LineageValidationView lineageView = new LineageValidationView(new FamilyTreeController(new FamilyTree()),
                new Scanner(System.in));
        lineageView.startEnteringData();
    }
}
