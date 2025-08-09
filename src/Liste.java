import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// s-au importat aceste 3 librarii
//librarie = pachet (colectie) de clase, metode si functii gata facute, pe care le pot folosi in programul meu prin import

public class Liste {
    public static void main(String[] args) {
        // liste - structuri de date ordonate (ordonate in f de index: 0,1,2..)

        //declaram o lista goala
        List<String> fructe = new ArrayList<>();

        //au o dimensiune dinamica
        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum sa iau elemente
        System.out.println(fructe.get(0));

        // cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));

        //este lista goala?
        System.out.println(fructe.isEmpty());

        // eliminam toate elementele din lista
        //fructe.clear();

        // scoatem un element
        fructe.remove("mar");

        //aflam dimensiunea listei
        System.out.println(fructe.size());

        //listam elementele
        System.out.println(Arrays.toString(fructe.toArray())); // -> [banana, portocala]
        //sau, mai usor
        System.out.println(fructe); //o lista poate fi afisata asa, un array nu

        if (!fructe.isEmpty()) { //daca nu este goala
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

        //declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});

        //listam elementele
        System.out.println(numere);

        /* declaram o lista dinamica:
        pornim de la un array pe care il transformam intr-o lista
        (creeam o variabila noua care sa parcurga variabila din array si sa o transforme intr-o lista) */
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String>flowerList = new ArrayList<>(Arrays.asList(flowers));

        //adaugam element in lista
        flowerList.add("Rose");
        System.out.println(flowerList);

        // cum se afla indexul unui element
        //aflam unde este Poppy
        int poppyIndex = flowerList.indexOf("Poppy");

        //stergem ce este in acea pozitie
        flowerList.remove(poppyIndex);
        //am facut variabila int pt a sterge ce e in acel index, indiferent de ce e acolo, in caz ca s-a modificat numele poppy de ex

        //scoatem in f de valoare
        flowerList.remove("Catmint");
        System.out.println(flowerList);
    }
}
