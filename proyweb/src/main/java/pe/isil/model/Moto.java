package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Moto {

    @Nullable
    private Long numero;
    @Nullable
    private String placa;
    @Nullable
    private String modelo;
    @Nullable
    private String color;
    @Nullable
    private String estadoOpe;

}
