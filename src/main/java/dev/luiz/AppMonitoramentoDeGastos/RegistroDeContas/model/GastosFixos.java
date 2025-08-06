package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums.TipoDeGastoFixoENUM;

public class GastosFixos {
    @JsonProperty("tipo_de_gasto_fixo")
    private TipoDeGastoFixoENUM tipoDeGastoFixo;
    @JsonProperty("valor")
    private double valor;

    public GastosFixos(TipoDeGastoFixoENUM tipoDeGastoFixo, double valor){
        this.tipoDeGastoFixo = tipoDeGastoFixo;
        this.valor = valor;
    }

    public TipoDeGastoFixoENUM getTipoDeGastoFixo() {
        return tipoDeGastoFixo;
    }

    public void setTipoDeGastoFixo(TipoDeGastoFixoENUM tipoDeGastoFixo) {
        this.tipoDeGastoFixo = tipoDeGastoFixo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
