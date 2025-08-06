package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums.TipoDeGastoComLazerENUM;

public class GastosComLazer {

    @JsonProperty("tipo_de_lazer")
    private TipoDeGastoComLazerENUM tipoDeLazerENUM;
    @JsonProperty("valor_gasto")
    private double valorGasto;
    @JsonProperty("qtd_de_vezes")
    private int qtdDeVezes;


    public GastosComLazer(TipoDeGastoComLazerENUM tipoDeLazer, double valorGasto, int qtdDeVezes){
        this.tipoDeLazerENUM = tipoDeLazer;
        this.valorGasto = valorGasto;
        this.qtdDeVezes = qtdDeVezes;
    }
}
