public class Functii {
    // functie = logica delimitata care poate fi refolosita
    //fara spatii in nume
    // nu putem defini o f in alta f (nu pot instala firefox in chrome)
    //putem apela o f in alta f
    // o functie simpla care ne printeaza ceva pe ecran
    // nu returneaza nimic (nu ne da niciun raspuns)
    // nu are parametri
    public static void printGreeting(){
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie care saluta clientul in f de numele lui
    // nu returneaza nimic (nu ne da niciun raspuns)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua, " + nume + " " + prenume);
    }

    // o functie care calculeaza media a 3 numere
    // va avea return (ne da un raspuns: suma nr)
    // ce tip de date va avea raspunsul? - double
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c) {
        //return - trimite rezultatul expresiei catre apelul functiei
        return (a + b +c) / 3;
    }
    // o functie care ne da valoarea lui pi
    // va avea return (ne da un raspuns)
    // ce tip de date va avea raspunsul? - double
    // nu are nevoie de parametri
    public static double piValue(){
        // constanta - variabila care nu poate fi suprascrisa; se scrie capitalletter
        final double PI = 3.14;
        return PI;
    }
    // aria unui dreptunghi
    public static double ariaDreptunghiului (double lungime, double latime){
        return lungime * latime;
    }
    // aria cercului
    public static double ariaCercului (double raza){
        return Math.PI * raza * raza;

    }
    // suma a 2 nr
    //variable scope
    public static int sumanumerelor (int a, int b){
        int suma = a + b;
        return suma;
    }

    // o f care returneaza cate caractere are numele + prenumele
    public static int caractere(String nume, String prenume){
        int numarCaractere = nume.length() + prenume.length();
        return numarCaractere;
    }
    //avand 3 numere, returnati pe cel mai mare
    //variable scope
    public static int celMaiMareNr (int a, int b, int c){
        if (a>=b && a>=c){
            return a;
        }else if(b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }

    public static void main(String[] args) { // desktop: in main apelam f
        // intra clientul 1
        printGreeting(); // se apeleaza functia
        // intra clientul 2
        printGreeting();  //Ctrl + Click pe f => ne duce la corpul f
        // apelam o functie cu parametri, oferind argumente
        printGreetingByName("Bucur", "Anamaria");
        printGreetingByName("Ionescu", "Alin");

        System.out.println(mediaNr(3, 3, 4));
        double media1 = mediaNr(31213, 3123313, 423);
        double media2 = mediaNr(35, 324, 41);
        double media3 = mediaNr(33, 11, 11);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
        System.out.println(caractere("Bucur","Anamaria")); //-> 13
        System.out.println(sumanumerelor(8,6));
        //rotunjim la 2 zecimale: %.2f
        //printf - print formatted -> pot formata cum sunt afisate valorile
        // \n - newline ->  linie noua dupa afisare
        System.out.printf("Aria cercului este: %.2f\n", ariaCercului(3));
        System.out.println("Aria dreptunghiului este " + ariaDreptunghiului(8.2,2.5));
        System.out.println("Cel mai mare nr este " + celMaiMareNr(8,9,11));
    }
}
