package com.example.project;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if(! isDataValida(dia, mes, ano))
          System.out.println("Erro");
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isDataValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        switch (mes) {
            case 2:
                if (verificaAnoBissexto(ano)) {
                    return dia <= 29;
                } else {
                    return dia <= 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return dia <= 30;
            default:
                return dia <= 31;
        }
    }

    /**
     * Método que retorna a representação em String da data.
     */
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}