package funcionario;

///import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

       

       //******dados diretor******
       System.out.println();
       System.out.println("******Informações do Diretor******");
       

        Endereco e = new Endereco();
        
        e.setCidade("Picos");
        e.setBairro("Centro");
        e.setRua("Coelho Rodrigues"); 
        e.setNumero(360);
        
        Diretor d = new Diretor();
        d.setNome("Pedro");
        d.setEndereco(e);
        d.setCargo("Diretor");

        System.out.println("--------------------------------------");
        System.out.println("NOME: " + d.getNome());  
        System.out.println("--------------------------------------");
        System.out.println("CIDADE: " + d.getEndereco().getCidade());
        System.out.println("--------------------------------------");
        System.out.println("BAIRRO: " + d.getEndereco().getBairro());
        System.out.println("---------------------------------------");
        System.out.println("RUA: " + d.getEndereco().getRua());
        System.out.println("--------------------------------------");
        System.out.println("NÚMERO: " + d.getEndereco().getNumero());
        System.out.println("--------------------------------------");
        System.out.println("CARGO: " + d.getCargo());
        

        d.salario();
        d.direitoViagemInternacionalPagoPelaEmpresa();
        d.direitoViagemNACIONALPagoPelaEmpresa();


//******informações do Gerente******
System.out.println();
System.out.println();
System.out.println("******Informações do Gerente******");

Endereco e2 = new Endereco();
        
e2.setCidade("Picos");
e2.setBairro("Junco");
e2.setRua("Coelho Neto"); 
e2.setNumero(125);

Gerente g = new Gerente();
g.setNome("Julia");
g.setEndereco(e);
g.setCargo("Gerente");

System.out.println("--------------------------------------");
System.out.println("NOME: " + g.getNome());  
System.out.println("--------------------------------------");
System.out.println("CIDADE: " + g.getEndereco().getCidade());
System.out.println("--------------------------------------");
System.out.println("BAIRRO: " + g.getEndereco().getBairro());
System.out.println("---------------------------------------");
System.out.println("RUA: " + g.getEndereco().getRua());
System.out.println("--------------------------------------");
System.out.println("NÚMERO: " + g.getEndereco().getNumero());
System.out.println("--------------------------------------");
System.out.println("CARGO: " + g.getCargo());


g.salario();
g.direitoViagemInternacionalPagoPelaEmpresa();
g.direitoViagemNACIONALPagoPelaEmpresa();

System.out.println();
       

    }
    
}
