package pe.proyecto.agrario.agrario.modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long idCita;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "cliente_cita_fk"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_servicio", nullable = false, foreignKey = @ForeignKey(name = "servicio_cita_fk"))
    private Servicio servicio;

    private LocalDateTime fecha;

    private String estado;
}