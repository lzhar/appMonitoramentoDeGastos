package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums;

public enum TipoDeGastoComBelezaENUM {
    SALAO("salao"),
    ITENSDECUIDADOPESSOA("itensDeCuidadoPessoal");

    private final String tipoDeGastoComBeleza;

    TipoDeGastoComBelezaENUM(String tipoDeGastoComBeleza){
        this.tipoDeGastoComBeleza = tipoDeGastoComBeleza;
    }

    public String getTipoDeGastoComBeleza(){
        return tipoDeGastoComBeleza;
    }

    public static TipoDeGastoComBelezaENUM fromString(String tipoDeGastoComBeleza){
        for(TipoDeGastoComBelezaENUM e : TipoDeGastoComBelezaENUM.values()){
            if(e.getTipoDeGastoComBeleza().equals(tipoDeGastoComBeleza)){
                return e;
            }
        }
        throw new IllegalArgumentException("O tipo de gasto de beleza que informou não existe!");
    }
}
