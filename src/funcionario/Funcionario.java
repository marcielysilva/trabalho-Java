package funcionario;

public abstract class Funcionario {
    
    private String nome;
    private String cargo;
    private Endereco endereco;
    
    //metodos abstratos
    public abstract void salario();
    public abstract void direitoViagemInternacionalPagoPelaEmpresa();
    public abstract void direitoViagemNACIONALPagoPelaEmpresa();

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



 
    
}
