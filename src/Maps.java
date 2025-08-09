import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Maps {
    public static void main(String[] args) {
        // map = reprezentare de date in sistem cheie-valoare
        // map - str de date neordonate (in loc de index, este cheia, o "porecla" data de noi; ex. George)
        //astfel, cand voi printa un map, se va afisa in ordine aleatorie
        // exemplu: Gigel are nota 10, Costel are nota 9

        //declaram un map
        Map<String, Integer> note_elevi = new HashMap<>();

        //adaugam elemente
        //mapam nota la un elev
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        //aflu notele
        System.out.println("Ana are nota " + note_elevi.get("Ana"));

        // actualizam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel"));

        //aflam dimensiunea
        System.out.println(note_elevi.size());

        //stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.get("Gigel"));

        // declaram si initializam cu valori
        Map<String, Integer> luni = new HashMap<>()
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
            put("Apr", 4);
            put("Mai", 5);
        }};
        System.out.println(luni);

        // tema: avand 3 numere, returnati pe cel mai mare
        Map<String, Integer> numere = new HashMap<>();
        numere.put("a", 5);
        numere.put("b", 10);
        numere.put("c", 6);

        int a = numere.get("a");
        int b = numere.get("b");
        int c = numere.get("c");

        int max;

        if (a>=b && a>=c){
            max = a;
        }else if (b>=a && b>=c){
            max = b;
        }else {
            max = c;
        }
        System.out.println("Cel mai mare numar este: " + max);
    }
}

