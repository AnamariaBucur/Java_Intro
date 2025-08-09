public class For {
    public static void main(String[] args) {
        // for = loop, str repetitiva
        //se foloseste cand stim cate repetari vrem sa facem
        // raspunde la: de unde incepem?
        // pana unde mergem?
        // pasul de parcurgere?
        // problema: printam 101 dalmatieni
        for (int i = 1; i<=101; i++) {
            System.out.println("Dalmatianul cu nr " + i);
        }
        // ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 10, 20, 30};
        for (int i = 0; i < numere.length; i ++) {
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);
        }
        //parcurgem din 2 in 2
        for (int i = 0; i < numere.length; i +=2) {
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);
        }
        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere){
            System.out.println("Numarul este: " + numar);
        }

        //parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for(String culoare: culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }

        // suma numerelor din array
        int s = 0;
        for (int numar : numere){
             s = s + numar;
        }
        System.out.println("Suma numerelor este: " + s);

//        //de cate ori apare 3 in [3, 2, 3, 5, 3]
        int[] numere_ex = {3, 2, 3, 5, 3, 3};
        int count = 0;
        for (int numberToFind:numere_ex) {
            if (numberToFind == 3){
                count++;
            }
        }
        System.out.println("Cifra 3 apare de " + count + " ori");
    }
}
