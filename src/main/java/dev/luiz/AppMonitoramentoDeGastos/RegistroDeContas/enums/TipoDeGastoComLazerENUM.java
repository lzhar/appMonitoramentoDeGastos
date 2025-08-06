package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums;

public enum TipoDeGastoComLazerENUM {
    PASSEIO("passeio"),
    VIAGEM("viagem"),
    COMIDA("comida");

    private final String tipoDeGastoComLazer;

    TipoDeGastoComLazerENUM(String tipoDeGastoComLazer){
        this.tipoDeGastoComLazer = tipoDeGastoComLazer;
    }

    public String getTipoDeGastoComLazer(){
        return tipoDeGastoComLazer;
    }

    public static TipoDeGastoComLazerENUM fromString(String tipoDeGastoComLazer){
        for(TipoDeGastoComLazerENUM e: TipoDeGastoComLazerENUM.values()){
            if(e.getTipoDeGastoComLazer().equals(tipoDeGastoComLazer)){
                return e;
            }
        }
        throw new IllegalArgumentException("O tipo de gasto com lazer que informou não existe");
    }
}
