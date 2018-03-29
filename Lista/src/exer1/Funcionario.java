package exer1;

import java.time.LocalDate;

public class Funcionario {

    int idFunc;
    String nomeFunc, departamento, documento;
    LocalDate dataContratacao;
    private double salario = 500.0;
    boolean estAtivo;

    void atualizarSalario(double aumento) {
        
        salario += aumento;
    }

    void demitirFuncionario() {
        
        if(estAtivo == true){
             estAtivo = false;
        }
    }

    void imprimir() {

        System.out.println("ID: " + idFunc);
        System.out.println("Nome: " + nomeFunc);
        System.out.println("Departamento: " + departamento);
        System.out.println("Data Contratação: " + dataContratacao);
        System.out.println("Salario: " + salario);
        System.out.println("Ativo: " + estAtivo);       
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEstAtivo() {
        return estAtivo;
    }

    public void setEstAtivo(boolean estAtivo) {
        this.estAtivo = estAtivo;
    }    
}
