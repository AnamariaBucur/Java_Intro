import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
        //cele mai folosite 5 tipuri de date:
        //String = sir de caractere delimitate de " "
        // cu litera mare, deoarece este o clasa ce concateneaza un sir de caractere
        // tip de date non-primitiv
        String marca = "Dacia";
        String model = "1301";
        System.out.println("Am masina " + marca + " "+ model);
        //metode prin numele variabilei String.
        //scriem cu litere mari
        System.out.println(marca.toUpperCase());
        //aflam dimensiunea unui string
        System.out.println(marca.length());
        String a = "3";
        String b = "4";
        System.out.println(a+b);

        // integer = numar intreg; (int)
        int anFabricatie = 1987;
        int a1 = 3;
        int b1 = 4;
        System.out.println(a1+b1);

        // double = numar zecimal; cu . nu ,
        // mai multe zecimale decat float
        double pret = 2300.50;

        //boolean = adevarat(1) sau fals(0)
        boolean inmatriculata = true;

        //char = un singur caracter delimitat de ' '
        char nota = 'A';
    }
}
