package dev.franciscomontalvao.mastersys.dto;

import dev.franciscomontalvao.mastersys.domain.Aluno;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AlunoResponse (
        Long id,
        String nome,
        LocalDate dataNascimetno,
        String sexo,
        String celulcar,
        String email,
        String cidade,
        String estado,
        LocalDateTime criadoEm
){


    public static AlunoResponse fromEntity(Aluno aluno){
        return new AlunoResponse(
                aluno.getId(),
                aluno.getNome(),
                aluno.getDataNascimento(),
                aluno.getSexo(),
                aluno.getCelular(),
                aluno.getEmail(),
                aluno.getCidade(),
                aluno.getEstado(),
                aluno.getCriadoEm()
        );
    }
}
