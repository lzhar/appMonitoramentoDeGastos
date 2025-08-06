package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.enums;

public enum TipoDeGastoFixoENUM {
    FATURA("fatura"),
    EMPRESTIMO("emprestimo");

    private final String tipoDeGastoFixo;

    TipoDeGastoFixoENUM(String tipoDeGastoFixo){
        this.tipoDeGastoFixo = tipoDeGastoFixo;
    }

    public String getTipoDeGastoFixo(){
        return tipoDeGastoFixo;
    }

    public static TipoDeGastoFixoENUM fromString(String tipoDeGastoFixo){
        for(TipoDeGastoFixoENUM e : TipoDeGastoFixoENUM.values()){
            if(e.getTipoDeGastoFixo().equals(tipoDeGastoFixo)){
                return e;
            }

        }
        throw new IllegalArgumentException("O tipo de gasto fixo não existe!");
    }
}
