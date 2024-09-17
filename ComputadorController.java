package src.contreller;

import src.domin.Computador;
import src.domin.ComputadorRepository;

import java.util.Optional;

public class ComputadorController {
    private ComputadorRepository repository = new ComputadorRepository();

    public Computador criarComputador(String nome, String cor, String dataFabricacao) {
        Computador computador = new Computador(null, nome, cor, dataFabricacao);
        return repository.salvar(computador);
    }

    // busca id
    public Computador buscarComputadorPorId(Long id) {
        Optional<Computador> computador = repository.buscarPorId(id);
        return computador.orElse(null);
    }

    // tedos os computadores
    public void listarComputadores() {
        System.out.println("Lista de Computadores:");
        for (Computador computador : repository.listarTodos()) {
            System.out.println("ID: " + computador.getId() + ", Nome: " + computador.getNome());
        }
    }

    //atualizar computador
    public Computador atualizarComputador(Long id, String nome, String cor, String dataFabricacao) {
        Computador computadorAtualizado = new Computador(id, nome, cor, dataFabricacao);
        return repository.atualizar(id, computadorAtualizado);
    }

    // deletar computador
    public boolean deletarComputador(Long id) {
        return repository.deletar(id);
    }
}

