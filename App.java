package src;

import src.contreller.ComputadorController;
import src.domin.Computador;

public class App {
    public static void main(String[] args) {
        ComputadorController controller = new ComputadorController();

        // fz computador
        Computador c1 = controller.criarComputador("Dell XPS", "Preto", "2023-01-15");
        Computador c2 = controller.criarComputador("MacBook Pro", "Cinza", "2022-10-22");

        // todos os computador
        controller.listarComputadores();

        // Busca pelo id
        Computador buscado = controller.buscarComputadorPorId(c1.getId());
        if (buscado != null) {
            System.out.println("Comptador encontrado: " + buscado.getNome());
        } else {
            System.out.println("Computador não encontrado.");
        }

        controller.atualizarComputador(c2.getId(), "MacBook Pro M2", "Cinza", "2023-05-30");
        controller.listarComputadores();
        controller.deletarComputador(c1.getId());
        controller.listarComputadores();
    }
}
