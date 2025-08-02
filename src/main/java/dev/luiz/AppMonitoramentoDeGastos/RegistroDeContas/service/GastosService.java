package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.service;

import org.springframework.stereotype.Service;

@Service
public class GastosService {

    public double retornarPorcentagemNoSalario(double salario, double valor){
        double valorMult = valor * 100;
        double porcentagem = valorMult / salario;

        return porcentagem;
    }

    public void montarPlanilhaBaseadaNosDados(double gastosComPassagem, double gastosComFatura, double dinheiroDestinadoParaInvestimentos, double gastosComBeleza, double gastosComLazer){
        double salario = 3000;

        double porcentagemDoSalario = retornarPorcentagemNoSalario(salario, gastosComBeleza);
        System.out.println(porcentagemDoSalario);

    }

}
