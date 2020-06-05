package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chofer {

    private Integer DNI;
    private String Nombre;
    private String Apellidos;
    private String Email;
    private String Contra;
    private LocalDate fecIngreso;
    private List<Moto> Moto;
    private List<Paradero> paraderos;
}
