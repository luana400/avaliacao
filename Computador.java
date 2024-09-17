package domin;

//import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Computador {

    private Long id;
    private String nome;
    private String cor;
    private int dataFabrigacao;

}
