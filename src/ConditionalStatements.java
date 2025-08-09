import java.util.Scanner;

/* flow control - if, else, switch
evalueaza conditii si bifurca codul in functie de rezultat
*/
public class ConditionalStatements {
    public static void main(String[] args) { //functia main - km 0
        System.out.println("Pornesc radio");
        boolean piesa_faina = true; //invat calculatorul daca piesa e faina sau nu
        //if
        //daca piesa e faina, dau mai tare radioul
        if (piesa_faina == true){
            System.out.println("Dau mai tare radioul");
            System.out.println("Incep sa fredonez piesa");
        }
        System.out.println("Opresc radio");

        //if else
        int numar = 3;
        //ce inseamna nr par? se imparte exact la 2
        //ce inseamna ca se imparte exact la 2? ne da restul 0
        if (numar % 2 == 0) {
            System.out.println("numar par");
        } else {
            System.out.println("numar impar");
        }
        //if, else if, else - cand lucram cu range-uri/intervale, adica o varietate de nr
        //ex exercitiu: daca are sub 18 ani, nu poate paria
        //alt ex: <0 vit invalida; == 0 stationeaza; <=50 localitate; <=90 drum judetean
        //cum ne saluta robotelul in f de ora si ziua saptamanii
        //luam date de la tastatura

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti ora");
        int ora = scanner.nextInt(); //Scanner primeste sir de caractere = String; ca sa convertim in int, folosim metoda

        scanner.nextLine(); //consuma Enter-ul ramas
        // Metoda nextInt() citește doar nr, dar nu consumă și caracterul Enter (\n) apăsat după ce scrii acel număr
        //astfel, enter ramane in buffer si la zi, citeste doar enter-ul, nu'ti asteapta inputul cu ziua

        System.out.println("Introduceti ziua saptamanii");
        String zi = scanner.nextLine();

        //adaugam mesaj in f de ora
        if (ora < 0 || ora >24){
            System.out.println("Ora invalida.");
        }else if (ora <=11){
            System.out.print("Buna dimineata!"); //print nu println, ca sa afiseze mesajele pe ac rand
        }else if (ora <=18) {
            System.out.print("Buna ziua!");
        }else if (ora <=21){
            System.out.print("Buna seara!");
        }else {
            System.out.print("Noapte buna!");
        }
        //adaugam mesaj in functie de zi
        // equalsIgnoreCase () ignora majusculele cand verifica ziua (poti scrie "Luni" sau "luni"

        if (zi.equalsIgnoreCase("sambata") || zi.equalsIgnoreCase("duminica")){
            System.out.println(" Relaxeaza-te, e weekend!");
        } else {
            System.out.println(" Spor la treaba!");
        }
        //switch - se foloseste cand stim valorile posibile; cand lucram cu valori exacte
        // ex cand suni la centrala si iti zice ce sa tastezi

        System.out.println("Alege optiunea");
        int optiune = scanner.nextInt();
        switch (optiune) {
            case 0:
                System.out.println("Meniu anterior");
                break;
            case 1:
                System.out.println("Ati ales romana");
                break;
            case 2:
                System.out.println("Ati ales engleza");
                break;
            default: //in loc de else
            System.out.println("Nu s-a identificat optiunea");
        }
    } //inchide functia main
} // inchide clasa