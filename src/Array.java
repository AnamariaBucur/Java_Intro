public class Array {
    public static void main(String[] args) {

        //declarare si initializare cand stim valorile:
        //contine mai multe elemente DE ACELASI TIP
        // index se trece in []
        //accesam elementele prin index, care incepe de la 0
        // are o dimensiune fixa - nu mai putem adauga elemente, pentru ca deja s-a alocat o zona de memorie
        // are proprietatea length care ne da dimensiunea array-ului; incepe de la 1

        String[] elevi ={"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numere = {1, 33, 81, 99, 201};
        System.out.println(elevi[2]); //-> Mari
        elevi[2] = "Sebi"; //suprascriere
        System.out.println(elevi[2]); // -> Sebi
        System.out.println(elevi.length); //-> 5

        // putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]); //-> Gigel Costel
        System.out.println(elevi.length + 5); //-> 10

        //sa printam tot timpul ultimul element indiferent de marime
        //pt ca e in [] se va lua la final drept index, nu length
        System.out.println("Last place: " + elevi[elevi.length-1]);

        //declarare si alocare de memorie (fara initializare)
        int[] note = new int[5];
        System.out.println(note[1]); // -> 0, pt ca int are valoare default 0
        note[0] = 10;
        note[1] = 9;
        System.out.println(note[1]);
    }
}
