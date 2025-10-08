public class Main {

    public static void main(String[] args) {

        Professor prof = new Professor(12345, "Ana", "Ciência da Computação");

        prof.imprimir();

        prof.setNomeProfessor("Ana Maria Souza");
        prof.setNomeDepartamento("Engenharia de Software");

        System.out.println("\nDados atualizados:");
        System.out.println("Nome: " + prof.getNomeProfessor());
        System.out.println("Departamento: " + prof.getNomeDepartamento());

    }
}
