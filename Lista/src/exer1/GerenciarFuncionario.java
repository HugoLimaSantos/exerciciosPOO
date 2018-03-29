package exer1;

import java.time.LocalDate;
import java.time.Month;

public class GerenciarFuncionario {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        
        func.idFunc = 1;
        func.nomeFunc = "Jose";
        func.departamento = "Compras";
        func.documento = "111.222.333";
        func.dataContratacao = LocalDate.of(2018, Month.MARCH, 23);
        func.estAtivo = true;
        
        func.imprimir();
        func.demitirFuncionario();        
        func.atualizarSalario(100);
        func.imprimir();
       
    }
}
