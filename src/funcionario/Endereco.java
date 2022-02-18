package funcionario;

public class Endereco {
    
   private String cidade;
   private String Bairro;
   private String rua;
   private int numero; 

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cidade=" + cidade + ", Bairro=" + Bairro + ", rua=" + rua + ", numero=" + numero + '}';
    }
    
   
    
}
