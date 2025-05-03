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
@Table(name = "asignacion_servicio")
public class AsignacionServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignacion")
    private Long idAsignacion;

    @ManyToOne
    @JoinColumn(name = "id_servicio", nullable = false, foreignKey = @ForeignKey(name = "servicio_asignacion_servicio_fk"))
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false, foreignKey = @ForeignKey(name = "usuario_asignacion_servicio_fk"))
    private Usuario usuario;

    private String metodo;

    @Column(name = "fecha_asignacion")
    private LocalDateTime fechaAsignacion;
}
