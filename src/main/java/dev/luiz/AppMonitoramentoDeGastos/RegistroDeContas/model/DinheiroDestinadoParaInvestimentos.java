package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums.TipoDeInvestimentoENUM;

public class DinheiroDestinadoParaInvestimentos {

    @JsonProperty("tipo_de_investimento")
    private TipoDeInvestimentoENUM tipoDeInvestimento;
    @JsonProperty("valor_investido")
    private double valorInvestido;

    public DinheiroDestinadoParaInvestimentos(TipoDeInvestimentoENUM tipoDeInvestimento, double valorInvestido){
        this.tipoDeInvestimento = tipoDeInvestimento;
        this.valorInvestido = valorInvestido;
    }

    public TipoDeInvestimentoENUM getTipoDeInvestimento() {
        return tipoDeInvestimento;
    }

    public void setTipoDeInvestimento(TipoDeInvestimentoENUM tipoDeInvestimento) {
        this.tipoDeInvestimento = tipoDeInvestimento;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }
}
