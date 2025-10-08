public class Main {

    public static void main(String[] args) {

        Porta porta1 = new Porta("Branca", 5, 3, false);

        System.out.println(porta1);

        porta1.setCor("Azul");
        porta1.setAberta(true);

        System.out.println("\nmodificada\n");

        System.out.println(porta1);

    }
}
