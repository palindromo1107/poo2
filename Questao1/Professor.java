public class Professor {

    private int matricula;
    private String nome;
    private String departamento;

    public Professor(int matricula, String nome, String departamento) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNomeProfessor() {
        return nome;
    }

    public String getNomeDepartamento() {
        return departamento;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNomeProfessor(String nome) {
        this.nome = nome;
    }

    public void setNomeDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void imprimir() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
    }

}
