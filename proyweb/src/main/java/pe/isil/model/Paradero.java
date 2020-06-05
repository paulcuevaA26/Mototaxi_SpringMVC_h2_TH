package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paradero {

    private String NombreParadero;
    private String Direccion;
    private Integer CantChoferes;

}
