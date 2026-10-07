package br.com.caio.spring_boot_essentials.database.repository;

import br.com.caio.spring_boot_essentials.database.model.AlunosEntity;
import br.com.caio.spring_boot_essentials.database.model.AvaliacoesFisicasEntity;
import br.com.caio.spring_boot_essentials.dto.AvaliacoesFisicasProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;

import java.util.List;

public interface IAvaliacaoFisicaRepository extends JpaRepository<AvaliacoesFisicasEntity, Integer> {

    @NativeQuery(value = """
        SELECT a.id                                     idAluno,
               a.nome                                   nomeAluno,
               af.id                                    idAvaliacao,
               af.peso                                  peso,
               af.altura                                altura, 
               af.percentual_gordura_corporal           percentualGorduraCorporal
        FROM tb_avaliacoes_fisicas af
        INNER JOIN tb_alunos a 
        ON a.id = af.alunoId
    """)
    List<AvaliacoesFisicasProjection> getAllAvaliacoes();
}
