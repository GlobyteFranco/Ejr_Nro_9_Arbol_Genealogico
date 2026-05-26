package controllers;

import models.FamilyTree;
import models.Nationalities;
import models.Relative;

public class FamilyTreeController {
    FamilyTree familyTree;

    public FamilyTreeController(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public void enterDataController(int dni, String name, String lastName, String nationalitie) {
        Nationalities relativesNationalitie = Nationalities.valueOf(nationalitie);
        Relative relative = new Relative(dni, name, lastName, relativesNationalitie);
        familyTree.addRelative(relative);
    }

    public boolean checkLineage() {
        return familyTree.checkLineageCondition();
    }
}
