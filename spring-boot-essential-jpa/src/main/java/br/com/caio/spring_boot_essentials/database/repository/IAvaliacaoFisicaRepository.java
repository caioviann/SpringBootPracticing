package br.com.caio.spring_boot_essentials.database.repository;

import br.com.caio.spring_boot_essentials.database.model.AlunosEntity;
import br.com.caio.spring_boot_essentials.database.model.AvaliacoesFisicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAvaliacaoFisicaRepository extends JpaRepository<AvaliacoesFisicasEntity, Integer> {
}
