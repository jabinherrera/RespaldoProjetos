package trattoria.api.models;

import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Almuerzo")
public class Almuerzo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "precio", nullable = false)
    private int precio;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "valoracion", nullable = false)
    private double valoracion;

    @Column(name = "urlImagen", nullable = false)
    private String urlImagen;
}
