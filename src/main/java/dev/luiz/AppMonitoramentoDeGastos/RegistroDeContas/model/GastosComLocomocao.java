package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums.TipoDeGastoComLocomocaoENUM;

public class GastosComLocomocao {

    @JsonProperty("tipo_de_locomocao")
    private TipoDeGastoComLocomocaoENUM tipoDeLocomocao;
    @JsonProperty("valor_gasto")
    private double valorGasto;
    @JsonProperty("qtd_de_vezes")
    private int qtdDeVezes;

    public GastosComLocomocao(TipoDeGastoComLocomocaoENUM tipoDeLocomocao, double valorGasto, int qtdDeVezes){
        this.tipoDeLocomocao = tipoDeLocomocao;
        this.valorGasto = valorGasto;
        this.qtdDeVezes = qtdDeVezes;
    }

    public void setTipoDeLocomocao(TipoDeGastoComLocomocaoENUM tipoDeLocomocao){
        this.tipoDeLocomocao = tipoDeLocomocao;
    }
    public TipoDeGastoComLocomocaoENUM getTipoDeLocomocao(){
        return tipoDeLocomocao;
    }

    public void setValorGasto(double valorGasto){
        this.valorGasto = valorGasto;
    }
    public double getValorGasto(){
        return valorGasto;
    }

    public void setQtdDeVezes(int qtdDeVezes){
        this.qtdDeVezes = qtdDeVezes;
    }
}
