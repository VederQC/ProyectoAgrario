package pe.proyecto.agrario.agrario.service.impl;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.proyecto.agrario.agrario.modelo.Mensaje;
import pe.proyecto.agrario.agrario.repository.ICrudGenericRepository;
import pe.proyecto.agrario.agrario.repository.IMensajeRepository;
import pe.proyecto.agrario.agrario.service.IMensajeService;

@Transactional
@Service
@RequiredArgsConstructor
public class MensajeServiceImpl extends CrudGenericServiceImpl<Mensaje,Long> implements IMensajeService {
    private final IMensajeRepository mensajeRepository;
    @Override
    protected ICrudGenericRepository<Mensaje, Long> getRepo() {
        return mensajeRepository;
    }
}
