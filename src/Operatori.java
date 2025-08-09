/*
Recap:
variabile = zone din memorie care stocheaza anumite date
tipuri de date: char, String, int, float/double, boolean

Operatori:
aritmetici: +, -, *, /, %
de comparare: <,>, ==, != (diferit), <=, >=
logici: && (and), || (or), ! (not - inverseaza raspunsul)
*/
// = este atribuire; == este comparatie
public class Operatori {
    public static void main(String[] args) {
        int a = 3; //declarare && initializare
        int b = 5;
        a = b; //suprascriere
        // operatori aritmetici
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); //restul impartirii lui a la b
        //operatori de comparare
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b); // a egal cu 5?
        System.out.println(a!=b); // a diferit de b?
        System.out.println(a>=b);
        System.out.println(a<=b);
        //operatori logici
        System.out.println(7>b && 3>b); //7>5 si 8>5?
        System.out.println(7>b || 3>b); //7>5 sau 3>5?
        System.out.println(7>b && (2>b || 3>b)); //mai intai se ef (), deci fals
        System.out.println(7>b || (2>b || 3>b)); //true || false => true
        System.out.println(!(7>b)); //!true => false
    }
}
