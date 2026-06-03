package dev.franciscomontalvao.mastersys.repository;

import dev.franciscomontalvao.mastersys.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    boolean existsByEmail(String email);
}
