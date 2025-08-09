import java.sql.SQLOutput;
import java.util.Scanner;

/*
Flow control (conditionale): directionarea codului in functie de o conditie
if else - evalueaza conditii si bifurca codul in functie de rezultat
        */
public class ifElse {
    public static void main(String[] args) {
        System.out.println("pornim radio");
        boolean piesaFaina = true; //invat calculatorul daca piesa e faina sau nu
        // daca piesa e faina, dau mai tare
        if (piesaFaina == true) {
            System.out.println("dau mai tare");
            System.out.println("incep sa o fredonez");
        }
        System.out.println("oprim radio");
        // daca nr este par printam acest lucru
        // altfel, printam impar
        //nr par, adica se imparte exact la 2 => rest 0
        int nr = 3;
        if(nr%2==0) {
            System.out.println("Acest nr este par");
        } else {
            System.out.println("Acest nr este impar");
            }
        // este un nr pozitiv?
        if(nr>0){
            System.out.println("nr pozitiv");
        }else {
            System.out.println("nr negativ");
        }
        //daca are sub 18 ani, nu poate paria

        //if, else if, else
        //ex: cum ne saluta robotelul in f de ora si zi?
        //luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        //introdu ora
        System.out.println("Introdu ora");
        int ora = sc.nextInt();
        sc.nextLine(); // consuma linia noua dupa nextInt()
        //intodu ziua
        System.out.println("Introduceti ziua saptamanii:");
        String zi = sc.nextLine().toLowerCase();

        if(ora<0 || ora>24){
            System.out.println("Ora invalida.");
        } else if (ora<=11) {
            System.out.print("Buna dimineata!");
        } else if (ora <=18) {
            System.out.print("Buna ziua!");
        } else if (ora<=21) {
            System.out.print("Buna seara!");
        } else {
            System.out.print("Noapte buna!");
        }
        //adaugam mesaj in f de zi; ignoram majusculele
        if (zi.equals("sambata") || zi.equals("duminica")) {
            System.out.println("Relaxeaza-te, e weekend!");
        }else{
            System.out.println("Spor la treaba!");
        }

        //ctrl + / -> se comenteaza liniile de cod

        //flow control:
        //switch - se foloseste cand stim valorile posibile
        System.out.println("Alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea){
            case 0:
                System.out.println("Meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("en");
                break;
            default:
                System.out.println("optiune invalida");
        }
    }
}
