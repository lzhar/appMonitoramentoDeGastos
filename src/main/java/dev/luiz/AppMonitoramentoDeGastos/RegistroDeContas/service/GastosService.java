package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.service;

import com.opencsv.CSVWriter;
import dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model.*;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class GastosService {

    public double retornarPorcentagemNoSalario(double salario, double valor){
        double valorMult = valor * 100;
        double porcentagem = valorMult / salario;

        return porcentagem;
    }

    public void registrarGastoNoBanco(){

    }

//    public void montarPlanilhaBaseadaNosDados(double gastosComPassagem, double gastosComFatura, double dinheiroDestinadoParaInvestimentos, double gastosComBeleza, double gastosComLazer){
//        double salario = 3000;
//        String caminho = "despesas.csv";
//
//
//
//        try(CSVWriter writer = new CSVWriter(new FileWriter(caminho))){
//            String passagemEmString = Double.toString(gastosComPassagem);
//            String gastosComFaturaEmString = Double.toString(gastosComFatura);
//            String dinheiroDestinadoParaInvestimentosEmString = Double.toString(dinheiroDestinadoParaInvestimentos);
//            String gastosComBelezEmString = Double.toString(gastosComBeleza);
//            String gastosComLazerEmString = Double.toString(gastosComLazer);
//            String salarioEmString = Double.toString(salario);
//
//
//
//            String[] cabecalho = {"Salario", "Gastos com passagem", "Gastos com fatura", "dinheiro para investimentos", "gastos com beleza", "gastos com lazer"};
//            writer.writeNext(cabecalho);
//
//            writer.writeNext(new String[]{salarioEmString, passagemEmString, gastosComFaturaEmString, dinheiroDestinadoParaInvestimentosEmString, gastosComBelezEmString, gastosComLazerEmString});
//
//
//            System.out.println("CSV gerado com sucesso!");
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        double porcentagemDoSalario = retornarPorcentagemNoSalario(salario, gastosComBeleza);
//        System.out.println(porcentagemDoSalario);
//
//    }

    public String receberDadosDeGastoDoCliente(GastosComLocomocao gastosComLocomocao, GastosFixos gastosComFixos,
                          DinheiroDestinadoParaInvestimentos dinheiroDestinadoParaInvestimentos, GastosComBeleza gastosComBeleza, GastosComLazer gastosComLazer){
        GastosDTO gastosDTO = new GastosDTO(gastosComLocomocao, gastosComFixos, dinheiroDestinadoParaInvestimentos, gastosComBeleza, gastosComLazer);

        return gastosDTO.toString();
    }
}
