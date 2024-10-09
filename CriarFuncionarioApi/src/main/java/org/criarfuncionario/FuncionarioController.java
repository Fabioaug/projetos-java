package org.criarfuncionario;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> criarFuncionario(@Valid @RequestBody Funcionario funcionario) {
        Funcionario novoFuncionario = funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoFuncionario);
    }

    @PutMapping("/{cracha}")
    public ResponseEntity<Funcionario> atualizarFuncionario(@PathVariable int cracha, @Valid @RequestBody Funcionario funcionarioAtualizado) {
        Optional<Funcionario> funcionario = funcionarioRepository.findById(cracha);

        if (funcionario.isPresent()) {
            Funcionario f = funcionario.get();
            f.setNome(funcionarioAtualizado.getNome());
            f.setSalario(funcionarioAtualizado.getSalario());
            f.setValorHora(funcionarioAtualizado.getValorHora());
            f.setQtdeHora(funcionarioAtualizado.getQtdeHora());
            f.setTipoVinculo(funcionarioAtualizado.getTipoVinculo());
            f.setValorDesconto(funcionarioAtualizado.getValorDesconto());
            return ResponseEntity.ok(funcionarioRepository.save(f));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{cracha}")
    public ResponseEntity<Void> deletarFuncionario(@PathVariable int cracha) {
        if (funcionarioRepository.existsById(cracha)) {
            funcionarioRepository.deleteById(cracha);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
