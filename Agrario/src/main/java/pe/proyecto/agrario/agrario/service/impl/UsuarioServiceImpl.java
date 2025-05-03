package pe.proyecto.agrario.agrario.service.impl;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.proyecto.agrario.agrario.modelo.Usuario;
import pe.proyecto.agrario.agrario.repository.ICrudGenericRepository;
import pe.proyecto.agrario.agrario.repository.IUsuarioRepository;
import pe.proyecto.agrario.agrario.service.IUsuarioService;

@Transactional
@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl extends CrudGenericServiceImpl<Usuario,Long> implements IUsuarioService {
    private final IUsuarioRepository usuarioRepository;
    @Override
    protected ICrudGenericRepository<Usuario, Long> getRepo() {
        return usuarioRepository;
    }
}
