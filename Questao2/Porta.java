public class Porta {

    private String cor;
    private int altura;
    private int largura;
    private boolean aberta;

    public Porta(String cor, int altura, int largura, boolean aberta) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.aberta = aberta;
    }

    public int getAltura() {
        return altura;
    }

    public String getCor() {
        return cor;
    }

    public int getLargura() {
        return largura;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String toString() {
        return "Cor: " + cor +
                "\nAltura: " + altura +
                "\nLargura: " + largura +
                "\nEsta aberta: " + aberta;
    }

}
