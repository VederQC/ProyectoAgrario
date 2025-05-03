package pe.proyecto.agrario.agrario.service.impl;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.proyecto.agrario.agrario.modelo.Cita;
import pe.proyecto.agrario.agrario.repository.ICitaRepository;
import pe.proyecto.agrario.agrario.repository.ICrudGenericRepository;
import pe.proyecto.agrario.agrario.service.ICitaService;

@Transactional
@Service
@RequiredArgsConstructor
public class CitaServicieImpl extends CrudGenericServiceImpl<Cita,Long> implements ICitaService {
    private final ICitaRepository citaRepository;
    @Override
    protected ICrudGenericRepository<Cita, Long> getRepo() {
        return citaRepository;
    }
}
