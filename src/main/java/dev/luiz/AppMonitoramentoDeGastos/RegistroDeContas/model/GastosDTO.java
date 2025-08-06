package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GastosDTO {

    @JsonProperty("gastos_com_locomocao")
    private GastosComLocomocao gastosComLocomocao;
    @JsonProperty("gastos_fixos")
    private GastosFixos gastosComFixos;
    @JsonProperty("dinheiro_destinado_para_investimentos")
    private DinheiroDestinadoParaInvestimentos dinheiroDestinadoParaInvestimentos;
    @JsonProperty("gastos_com_beleza")
    private GastosComBeleza gastosComBeleza;
    @JsonProperty("gastos_com_lazer")
    private GastosComLazer gastosComLazer;

    public GastosDTO(){

    }

    public GastosDTO(GastosComLocomocao gastosComLocomocao, GastosFixos gastosComFixos, DinheiroDestinadoParaInvestimentos dinheiroDestinadoParaInvestimentos, GastosComBeleza gastosComBeleza, GastosComLazer gastosComLazer){

        if(gastosComLocomocao != null){
            this.gastosComLocomocao = gastosComLocomocao;
        }
        if(gastosComFixos != null){
            this.gastosComFixos = gastosComFixos;
        }
        if(dinheiroDestinadoParaInvestimentos != null){
            this.dinheiroDestinadoParaInvestimentos = dinheiroDestinadoParaInvestimentos;
        }

        if(gastosComBeleza != null){
            this.gastosComBeleza = gastosComBeleza;
        }

        if(gastosComLazer != null){
            this.gastosComLazer = gastosComLazer;
        }

    }

    public GastosComLocomocao getGastosComLocomocao() {
        return gastosComLocomocao;
    }

    public void setGastosComPassagem(GastosComLocomocao gastosComLocomocao) {
        this.gastosComLocomocao = gastosComLocomocao;
    }

    public GastosFixos getGastosComFixos() {
        return gastosComFixos;
    }

    public void setGastosComFatura(GastosFixos gastosComFixos) {
        this.gastosComFixos = gastosComFixos;
    }

    public DinheiroDestinadoParaInvestimentos getDinheiroDestinadoParaInvestimentos() {
        return dinheiroDestinadoParaInvestimentos;
    }

    public void setDinheiroDestinadoParaInvestimentos(DinheiroDestinadoParaInvestimentos dinheiroDestinadoParaInvestimentos) {
        this.dinheiroDestinadoParaInvestimentos = dinheiroDestinadoParaInvestimentos;
    }

    public GastosComBeleza getGastosComBeleza() {
        return gastosComBeleza;
    }

    public void setGastosComBeleza(GastosComBeleza gastosComBeleza) {
        this.gastosComBeleza = gastosComBeleza;
    }

    public GastosComLazer getGastosComLazer() {
        return gastosComLazer;
    }

    public void setGastosComLazer(GastosComLazer gastosComLazer) {
        this.gastosComLazer = gastosComLazer;
    }

    @Override
    public String toString() {
        return "GastosDTO{" +
                "gastosComLocomocao=" + gastosComLocomocao +
                ", gastosComFixos=" + gastosComFixos +
                ", dinheiroDestinadoParaInvestimentos=" + dinheiroDestinadoParaInvestimentos +
                ", gastosComBeleza=" + gastosComBeleza +
                ", gastosComLazer=" + gastosComLazer +
                '}';
    }
}
