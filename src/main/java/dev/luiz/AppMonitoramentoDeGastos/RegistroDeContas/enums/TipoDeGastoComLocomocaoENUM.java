package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums;

public enum TipoDeGastoComLocomocaoENUM {
    UBER("uber"),
    ONIBUS("onibus"),
    GASOLINA("gasolina");

    private final String tipoDeLocomocao;

    TipoDeGastoComLocomocaoENUM(String tipoDeLocomocao){
        this.tipoDeLocomocao = tipoDeLocomocao;
    }

    public String getTipoDeLocomocao(){
        return tipoDeLocomocao;
    }

    public static TipoDeGastoComLocomocaoENUM fromString(String tipoDeLocomocao){
        for(TipoDeGastoComLocomocaoENUM e : TipoDeGastoComLocomocaoENUM.values()){
            if(e.getTipoDeLocomocao().equals(tipoDeLocomocao)){
                return e;
            }
        }
        throw new IllegalArgumentException("O tipo de gasto de locomoção que informou não existe!");
    }
}
