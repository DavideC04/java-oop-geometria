package org.lessons.java.geometria;

import java.util.Scanner;

/*
Creare una classe Main contenente il metodo main(),
nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo Rettangolo.
Dopo averlo istanziato, stampate a video il perimetro e l’area.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // chiedo all'utente di inserire i valori di base e di altezza
        // base
        System.out.println("Insert base value: ");
        int userBase = scan.nextInt();
        // altezza
        System.out.println("Insert height value: ");
        int userHeight = scan.nextInt();

        // con queste informazioni, creo un nuovo oggetto

        Rettangolo rettangolo = new Rettangolo(userBase, userHeight);

        // stampo il calcolo del perimetro, richiamando i metodi creati nella classe Rettangolo
        System.out.println("Rectangle perimeter: " + rettangolo.calcolaPerimetro() );
        // stampo il calcolo dell'area
        System.out.println("Rectangle area: " + rettangolo.calcolaArea());



        scan.close();
    }
}
