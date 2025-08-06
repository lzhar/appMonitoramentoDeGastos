package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums;

public enum TipoDeInvestimentoENUM {
    RENDAFIXA("rendaFixa"),
    CRIPTOMOEDA("criptomoeda"),
    INVESTIMENTOFISICO("investimentoFisico"),
    INVESTIMENTODEALTORISCO("investimentoDeAltoRisco");

    private final String tipoDeInvestimento;

    TipoDeInvestimentoENUM(String tipoDeInvestimento){
        this.tipoDeInvestimento = tipoDeInvestimento;
    }

    public String getTipoDeInvestimento(){
        return tipoDeInvestimento;
    }

    public static TipoDeInvestimentoENUM fromString(String tipoDeInvestimento){
        for(TipoDeInvestimentoENUM e : TipoDeInvestimentoENUM.values()){
            if(e.getTipoDeInvestimento().equals(tipoDeInvestimento)){
                return e;
            }
        }
        throw new IllegalArgumentException("O tipo de investimento não existe.");
    }
}
