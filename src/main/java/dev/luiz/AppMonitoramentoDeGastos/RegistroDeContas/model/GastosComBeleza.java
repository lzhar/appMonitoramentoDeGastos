package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums.TipoDeGastoComBelezaENUM;

public class GastosComBeleza {

    @JsonProperty("tipo_de_gasto_com_beleza")
    private TipoDeGastoComBelezaENUM tipoDeGastoComBeleza;
    @JsonProperty("valor_gasto")
    private double valorGasto;
    @JsonProperty("qtd_de_vezes")
    int qtdDeVezes;

    public GastosComBeleza(TipoDeGastoComBelezaENUM tipoDeGastoComBeleza, double valorGasto, int qtdDeVezes){
        this.tipoDeGastoComBeleza = tipoDeGastoComBeleza;
        this.valorGasto = valorGasto;
        this.qtdDeVezes = qtdDeVezes;
    }

    public TipoDeGastoComBelezaENUM getTipoDeGastoComBeleza() {
        return tipoDeGastoComBeleza;
    }

    public void setTipoDeGastoComBeleza(TipoDeGastoComBelezaENUM tipoDeGastoComBeleza) {
        this.tipoDeGastoComBeleza = tipoDeGastoComBeleza;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public int getQtdDeVezes() {
        return qtdDeVezes;
    }

    public void setQtdDeVezes(int qtdDeVezes) {
        this.qtdDeVezes = qtdDeVezes;
    }
}
