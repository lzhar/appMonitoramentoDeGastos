package dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.controller;


import dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.model.GastosDTO;
import dev.luiz.AppMonitoramentoDeGastos.RegistroDeContas.service.GastosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class GastosController {


    @Autowired
    GastosService gastosService;

    @PostMapping("/enviargastos")
    public ResponseEntity<?> enviarInfoParaMonitoramento(@RequestBody GastosDTO gastosDTO){

        gastosService.receberDadosDeGastoDoCliente(gastosDTO.getGastosComLocomocao(), gastosDTO.getGastosComFixos(),
                gastosDTO.getDinheiroDestinadoParaInvestimentos(), gastosDTO.getGastosComBeleza(), gastosDTO.getGastosComLazer());

        return ResponseEntity.accepted().body("a");

    }

}
