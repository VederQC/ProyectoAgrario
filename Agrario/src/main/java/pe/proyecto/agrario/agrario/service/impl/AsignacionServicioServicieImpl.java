package pe.proyecto.agrario.agrario.service.impl;


import pe.proyecto.agrario.agrario.modelo.AsignacionServicio;
import pe.proyecto.agrario.agrario.repository.IAsignacionServicioRepository;
import pe.proyecto.agrario.agrario.repository.ICrudGenericRepository;
import pe.proyecto.agrario.agrario.service.IAsignacionServicioService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Transactional
@Service
@RequiredArgsConstructor
public class AsignacionServicioServicieImpl extends CrudGenericServiceImpl<AsignacionServicio,Long>
        implements IAsignacionServicioService {
    private final IAsignacionServicioRepository asignacionServicioRepository;
    @Override
    protected ICrudGenericRepository<AsignacionServicio, Long> getRepo() {
        return asignacionServicioRepository;
    }
}
