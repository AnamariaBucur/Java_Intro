package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        //desktop

        //initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar

        ContBancar cont1 = new ContBancar("Ana B", "RO123");
        ContBancar cont2 = new ContBancar("Gigel", "RO120");

        //activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(3334);
        cont2.activareCont(7777);

        //alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        //negative testing (cheltuim mai mult decat avem)
        cont1.plataCard(500); //nu, 300.5 => pass

        //positive (cu suma exacta)
        cont1.plataCard(300.5); //da, 0.0 => pass

        //positive x2
        cont2.plataCard(100);
        cont2.plataCard(200); //da, 700 => pass

        cont1.interogareSold();
        cont2.interogareSold();
    }
}
