package frases.aleatorias.controller;

import frases.aleatorias.dto.SerieDTO;
import frases.aleatorias.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseService servico;
    @GetMapping("/frases")
    public SerieDTO obterFrase(){
        return servico.obterFrase();
    }
}
