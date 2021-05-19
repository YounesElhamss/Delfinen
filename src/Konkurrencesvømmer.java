import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Konkurrencesvømmer {

    //----Attributter----
    private String navn;
    private int alder;
    //private int svarPåAktivitetsstatus;

    private ArrayList<Konkurrencesvømmer> juniorsvømmerListe = new ArrayList<>();
    private ArrayList<Konkurrencesvømmer> seniorsvømmerListe = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    //----Gettere----
    public ArrayList<Konkurrencesvømmer> getSeniorsvømmerListe() {
        return seniorsvømmerListe;
    }

    public ArrayList<Konkurrencesvømmer> getJuniorsvømmerListe() {
        return juniorsvømmerListe;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    //----Konstruktør----
    public Konkurrencesvømmer(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    //----Overrrider konstruktøren----
    public Konkurrencesvømmer() {
    }

    //----Objekter----
    // Medlem medlem = new Medlem();
    Motionist motionist = new Motionist();
    Formand formand = new Formand();
    Menu menu = new Menu();

    // --------Gettere og settere --------------------


    public void setJuniorsvømmerListe(ArrayList<Konkurrencesvømmer> juniorsvømmerListe) {
        this.juniorsvømmerListe = juniorsvømmerListe;
    }

    public void setSeniorsvømmerListe(ArrayList<Konkurrencesvømmer> seniorsvømmerListe) {
        this.seniorsvømmerListe = seniorsvømmerListe;
    }


    @Override
    public String toString() {
        return navn + " " + alder + " år\n";
    }
}
