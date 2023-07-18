package org.lessons.java.geometria;

/*una classe Rettangolo con due attributi interi: base e altezza.
 Aggiungere un opportuno costruttore con parametri.
 Aggiungere due metodi: calcolaArea e calcolaPerimetro
 che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
 */
public class Rettangolo {
    // CAMPI

    int base;
    int altezza;



    // COSTRUTTORI

    Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    // METODI
    int calcolaArea() {
    // calcolo l'area del rettangolo
    int areaRettangolo = base * altezza;
    // ritorno il valore dell'area
    return areaRettangolo;
    }

    int calcolaPerimetro() {
        // calcolo il perimetro del rettangolo
    int perimetroRettangolo = base * 2 + altezza * 2;
    // ritorno il valore del perimetro
    return perimetroRettangolo;

    }

}
