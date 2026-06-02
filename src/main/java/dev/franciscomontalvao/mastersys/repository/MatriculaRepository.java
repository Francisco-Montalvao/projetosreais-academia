package dev.franciscomontalvao.mastersys.repository;

import dev.franciscomontalvao.mastersys.domain.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
