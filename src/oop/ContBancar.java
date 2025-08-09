package oop;

/* OOP:
inheritance
polimorphism
encapsulation
abstractization
*/
public class ContBancar {
    //program files = definim logica unui cont bancar

    //oop = object oriented programming
    //poo = programare orientata pe obiecte

    // o clasa = un tip nou; definitia unui concept
    // o clasa = o conceptualizare teoretica a unei entitati practice; blueprint
    // ex: reteta paste carbonara

    // un obiect = instanta unei clase (implementarea clasei)
    // ex: paste carbonara

    //variabile = fields = proprietati = atribute
    //ex: clasa Car
    //ex: obiect de tip Car
    //ex: culoare, marca, model, consum, pret, esteOprita

    //functii = metode = actiunile clasei; actiuni ce pot fi facute de obiecte
    // ex: accelereaza(), franeaza(), deschideUsa()

    //fieldurile:
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;

    //constructor = are rolul de a impune date de start
    // precum * din formulare (required fields)
    //click dr -> generate -> constructor -> fields
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    //metode
    public void interogareSold(){
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Nr de incercari gresite " + this.incercari_activare);
        System.out.println("-------------------");
    }
    public void salut(){
        System.out.println("Buna, " + this.titularCont);
    }
    public void activareCont(int pinUtilizator){
        //modifica activ in true doar daca pinul e corect
        salut();
        if(pinUtilizator == this.pin){
            this.activ = true;
            System.out.println("Card activat cu succes");
        }else {
            System.out.println("PIN gresit");
            this.incercari_activare++; //incrementare
        }
        //this.activ = true;
    }
    public void alimentareCont(double suma_depusa){
        // la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        salut();
        System.out.println("Ati depus cu succes suma de " + suma_depusa + ". Aveti in cont suma de " + this.sold);
    }
    public void plataCard(double suma_cheltuita){
        salut();
        // pot sa cheltuiesc doar ce am
        // daca suma cheltuita <= sold
        if(suma_cheltuita <= this.sold){
            //dispar banii din cont
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ati cheltuit " + suma_cheltuita);
            System.out.println("Mai aveti " + this.sold);
        }else{
            System.out.println("Fonduri insuficiente! ");
        }
    }

    // tema:
    // clasa Angajat
//nume, prenume, salariu, vechime, functie
//constructor : nume, prenume, salariu, vechime, functie
//metode:
// descriere: nume, prenume, salariu, vechime, functie
//marire salariu in f de vechime
    // daca are vechime sub 5 ani, marim cu 300 lei, daca peste 5 ani -- 500 lei
//actualizare vechime (parametru noua vechime)
            //this.vechime = noua vechime

}
