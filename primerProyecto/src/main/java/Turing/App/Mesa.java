package Turing.App;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Mesa {
    @Id
    private int nro;
    private String mozo;
}
