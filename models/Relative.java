package models;

import java.util.Optional;

public class Relative {// Responsable de mostrar y settear informacion
    private int dni;
    private String name;
    private String lastName;
    private Nationalities nationalitie;
    private Relative relativeA;
    private Relative relativeB;

    public Relative(int dni, String name, String lastName, Nationalities nationalitie) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.nationalitie = nationalitie;
    }

    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Nationalities getNationalitie() {
        return nationalitie;
    }

    public void setRelativeA(Relative relativeA) {
        this.relativeA = relativeA;
    }

    public void setRelativeB(Relative relativeB) {
        this.relativeB = relativeB;
    }

    public Optional<Relative> getRelativeA() {
        return Optional.ofNullable(this.relativeA);
    }

    public Optional<Relative> getRelativeB() {
        return Optional.ofNullable(this.relativeB);
    }

}
