package br.com.caio.spring_boot_essentials.database.repository;

import br.com.caio.spring_boot_essentials.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IExerciciosRepository extends JpaRepository<ExerciciosEntity, Integer> {

    List<ExerciciosEntity> findAllByGrupoMuscular(String grupoMuscular);

    @Query(value = """
        SELECT e
        FROM Exercicios e 
        WHERE UPPER(e.grupoMuscular) = UPPER(:grupoMuscular)
    """)
    List<ExerciciosEntity> findAllByGrupoMuscularJpql(@Param("grupoMuscular") String grupoMuscular);
}
