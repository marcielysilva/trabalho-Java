package funcionario;

public class Gerente extends Funcionario{


    @Override
   public void salario(){
    System.out.println("Salário ABAIXO de R$ 10.00");
   }

   @Override
   public void direitoViagemInternacionalPagoPelaEmpresa(){
    System.out.println("viagem internacional com contas paga pela empresa: NÃO TEM DIREITO");
   }

   @Override
   public void direitoViagemNACIONALPagoPelaEmpresa(){
    System.out.println("viagem nacional com contas paga pela empresa: TEM DIREITO");
   };

}
