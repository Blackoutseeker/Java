package banco;
public class Conta2 {
    private int numero = 2003;
    private String senha = "Vegeta";
    private double dinheiro = 0;
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    public double getDinheiro() {
        return dinheiro;
    }
    public int getNumero() {
        return numero;
    }
    public String getSenha() {
        return senha;
    }
}
