package br.com.caio.spring_boot_essentials.service;

import br.com.caio.spring_boot_essentials.database.model.AlunosEntity;
import br.com.caio.spring_boot_essentials.database.model.AvaliacoesFisicasEntity;
import br.com.caio.spring_boot_essentials.database.repository.IAlunosRepository;
import br.com.caio.spring_boot_essentials.database.repository.IAvaliacaoFisicaRepository;
import br.com.caio.spring_boot_essentials.dto.AvaliacaoFisicaDto;
import br.com.caio.spring_boot_essentials.exception.BadRequestException;
import br.com.caio.spring_boot_essentials.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaService {
    private final IAlunosRepository alunosRepository;
    private final IAvaliacaoFisicaRepository avaliacoesFisicasRepository;

    public void criarAvaliacaoFisica(AvaliacaoFisicaDto avaliacaoFisicaDto) throws NotFoundException, BadRequestException {
        AlunosEntity aluno = alunosRepository.findById(avaliacaoFisicaDto.getAlunoId())
                .orElseThrow(() -> new NotFoundException("Aluno não encontrado."));

        AvaliacoesFisicasEntity avaliacaoFisica = aluno.getAvaliacoeFisica();
        if(avaliacaoFisica != null){
            throw new BadRequestException("Avaliação fisica ja cadastrada para esse aluno");
        }

        avaliacaoFisica = AvaliacoesFisicasEntity.builder()
                .peso(avaliacaoFisicaDto.getPeso())
                .altura(avaliacaoFisicaDto.getAltura())
                .porcentagemGorduraCorporal(avaliacaoFisicaDto.getPorcentagemGorduraCorporal())
                .build();

        aluno.setAvaliacoeFisica(avaliacaoFisica);
        alunosRepository.save(aluno);
    }

}
