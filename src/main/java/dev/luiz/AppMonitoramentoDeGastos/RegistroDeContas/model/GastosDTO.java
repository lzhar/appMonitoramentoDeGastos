package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GastosDTO {

    @JsonProperty("gastos_com_passagem")
    private double gastosComPassagem;
    @JsonProperty("gastos_com_fatura")
    private double gastosComFatura;
    @JsonProperty("dinheiro_destinado_para_investimentos")
    private double dinheiroDestinadoParaInvestimentos;
    @JsonProperty("gastos_com_beleza")
    private double gastosComBeleza;
    @JsonProperty("gastos_com_lazer")
    private double gastosComLazer;

    public GastosDTO(double gastosComPassagem, double gastosComFatura, double dinheiroDestinadoParaInvestimentos, double gastosComBeleza, double gastosComLazer){
        this.gastosComPassagem = gastosComPassagem;
        this.gastosComFatura = gastosComFatura;
        this.dinheiroDestinadoParaInvestimentos = dinheiroDestinadoParaInvestimentos;
        this.gastosComBeleza = gastosComBeleza;
        this.gastosComLazer = gastosComLazer;
    }

    public double getGastosComPassagem() {
        return gastosComPassagem;
    }

    public void setGastosComPassagem(double gastosComPassagem) {
        this.gastosComPassagem = gastosComPassagem;
    }

    public double getGastosComFatura() {
        return gastosComFatura;
    }

    public void setGastosComFatura(double gastosComFatura) {
        this.gastosComFatura = gastosComFatura;
    }

    public double getDinheiroDestinadoParaInvestimentos() {
        return dinheiroDestinadoParaInvestimentos;
    }

    public void setDinheiroDestinadoParaInvestimentos(double dinheiroDestinadoParaInvestimentos) {
        this.dinheiroDestinadoParaInvestimentos = dinheiroDestinadoParaInvestimentos;
    }

    public double getGastosComBeleza() {
        return gastosComBeleza;
    }

    public void setGastosComBeleza(double gastosComBeleza) {
        this.gastosComBeleza = gastosComBeleza;
    }

    public double getGastosComLazer() {
        return gastosComLazer;
    }

    public void setGastosComLazer(double gastosComLazer) {
        this.gastosComLazer = gastosComLazer;
    }
}
