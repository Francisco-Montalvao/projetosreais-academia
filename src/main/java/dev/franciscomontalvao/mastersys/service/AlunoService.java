package dev.franciscomontalvao.mastersys.service;


import dev.franciscomontalvao.mastersys.domain.Aluno;
import dev.franciscomontalvao.mastersys.dto.AlunoRequest;
import dev.franciscomontalvao.mastersys.dto.AlunoResponse;
import dev.franciscomontalvao.mastersys.repository.AlunoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public AlunoResponse cadastrar (AlunoRequest request){
        if (request.email() != null && repository.existsByEmail(request.email())){
            throw new RuntimeException("Email já cadastrado");
        }

        Aluno aluno = request.toEntity();
        Aluno alunoSalvo = repository.save(aluno);
        return AlunoResponse.fromEntity(alunoSalvo);
    }

    public Page<AlunoResponse> listar(Pageable pageable){
        return repository.findAll(pageable).map(AlunoResponse::fromEntity);
    }

    public AlunoResponse buscarPorId(Long id){
        Aluno aluno = buscarAlunoPorId(id);
        return AlunoResponse.fromEntity(aluno);
    }


    public AlunoResponse atualizar(Long id, AlunoRequest request){
        Aluno aluno = buscarAlunoPorId(id);
        request.preencher(aluno);
        Aluno alunoAtualizado = repository.save(aluno);
        return AlunoResponse.fromEntity(alunoAtualizado);
    }


    public void exluir(Long id){
        Aluno aluno = buscarAlunoPorId(id);
        repository.delete(aluno);
    }


    private Aluno buscarAlunoPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
}
