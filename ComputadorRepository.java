package src.domin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepository {
    private List<Computador> computadores = new ArrayList<>();
    private Long idCounter = 1L;
    public Computador salvar(Computador computador) {
        computador.setId(idCounter++);
        computadores.add(computador);
        return computador;
    }

    // busca id
    public Optional<Computador> buscarPorId(Long id) {
        return computadores.stream()
                .filter(computador -> computador.getId().equals(id))
                .findFirst();
    }

    // todos os computadore
    public List<Computador> listarTodos() {
        return computadores;
    }

    // atualizar computador
    public Computador atualizar(Long id, Computador computadorAtualizado) {
        Optional<Computador> computadorOptional = buscarPorId(id);
        if (computadorOptional.isPresent()) {
            Computador computadorExistente = computadorOptional.get();
            computadorExistente.setNome(computadorAtualizado.getNome());
            computadorExistente.setCor(computadorAtualizado.getCor());
            computadorExistente.setDataFabricacao(computadorAtualizado.getDataFabricacao());
            return computadorExistente;
        }
        return null;
    }

    // deletar
    public boolean deletar(Long id) {
        return computadores.removeIf(computador -> computador.getId().equals(id));
    }
}

