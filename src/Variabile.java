public class Variabile {
    public static void main(String[] args) {
        //Java: strongly typed - trebuie specificat tipul de date
        //declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";
        System.out.println(marcaMasina + " " + modelMasina);
        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);
        //suprascrierea
        modelMasina = "XC 60 facelift";
        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);
        //declarare
        String nume;
        String prenume;
        //initializare
        //am declarat anterior tipul de date, deci nu mai specific
        nume = "Bucur";
        prenume = "Anamaria";
        //concatenare
        System.out.println(nume + " " + prenume);
    }
}
