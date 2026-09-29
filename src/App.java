public class App {
    public static void main(String[] args) throws Exception {
        String nimi = "Tatu";
        double luku1 = 7;
        double luku2 = 7;
        double tulo;
        double erotus;
        double summa;
        double jako;

        tulo = luku1 * luku2;
        erotus = luku1 - luku2;
        summa = luku1 + luku2;
        jako = luku1 / luku2;


        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.println("Ohjelman tekijä: " + nimi);
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2 muuttujan arvo on " + luku2);
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
        System.out.println(luku1 + " + " + luku2 + " = " + summa);
        System.out.println(luku1 + " / " + luku2 + " = " + jako);
        // System.out.println(luku1);




    }
}
