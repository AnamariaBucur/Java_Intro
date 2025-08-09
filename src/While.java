public class While {
    public static void main(String[] args) {
        //while = loop/bucla/ciclu repetitiv
        // zona de cod care se repeta atat timp cat o conditie e true

        //ex: masina merge cat timp inca are benzina:
        int litri_benzina = 10;
        while(litri_benzina > 0){
            //acceleram
            System.out.println("Vruum vruum!");
            //scade benzina
            litri_benzina = litri_benzina-1;
            //aprindem beculetul cand avem <=3L
            if (litri_benzina<=3){
                System.out.println("Se aprinde becul rosu!");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
