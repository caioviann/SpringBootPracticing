package frases.aleatorias.service;

import frases.aleatorias.dto.SerieDTO;
import frases.aleatorias.model.Frase;
import frases.aleatorias.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;

    public SerieDTO obterFrase(){
        Frase f = repositorio.obterFrases();
        SerieDTO serieDTO = new SerieDTO(f.getTitulo(), f.getFrase(), f.getPoster());
        return serieDTO;
    }
}
