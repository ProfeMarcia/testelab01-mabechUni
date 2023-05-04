package com.example.project;
/**
 * Write a description of class Loja here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loja
{
    // instance variables - replace the example below with your own
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data data;

   


    /**
     * Constructor for objects of class Loja
     */
    public Loja(String aNome, int aQntFuncionarios, double aSalario)
    {
        nome = aNome;
        quantidadeFuncionarios = aQntFuncionarios;
        salarioBaseFuncionario = aSalario;
    }
    
    
    public Loja(String aNome, int aQntFuncionarios)
    {
        nome = aNome;
        quantidadeFuncionarios = aQntFuncionarios;
        salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String aNome) {
        this.nome = aNome;
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }

    public void setSalarioFuncioario(double salarioFuncioario) {
        this.salarioBaseFuncionario = salarioFuncioario;
    }
    
    public String toString(){
        return "Nome:  " + "Quantidade : " + this.quantidadeFuncionarios;
    }
    
    public double gastosComSalario(){
        if(this.salarioBaseFuncionario != -1)
            return  this.quantidadeFuncionarios * salarioBaseFuncionario;
        return -1;
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
    public char tamanhoDaLoja(){
     if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30)
            return  'M';
     else if(this.quantidadeFuncionarios >= 31) 
            return  'G';
     return 'P';
    }
    
    
}
