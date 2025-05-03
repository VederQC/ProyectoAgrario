package pe.proyecto.agrario.agrario.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.proyecto.agrario.agrario.modelo.AsignacionServicio;
import pe.proyecto.agrario.agrario.service.IAsignacionServicioService;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/asignacionServicio")
public class AsignacionServicioController {
    private final IAsignacionServicioService asignacionServicioService;
    @GetMapping
    public ResponseEntity<List<AsignacionServicio>> findAll() {
        List<AsignacionServicio> list = asignacionServicioService.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AsignacionServicio> findById(@PathVariable("id") Long
                                                      id) {
        AsignacionServicio obj = asignacionServicioService.findById(id);
        return ResponseEntity.ok(obj);
    }
    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody AsignacionServicio dto) {
        AsignacionServicio obj = asignacionServicioService.save(dto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(
                obj.getIdAsignacion()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<AsignacionServicio> update(@PathVariable("id") Long
                                                    id, @RequestBody
    AsignacionServicio dto) {
        dto.setIdAsignacion(id);
        AsignacionServicio obj = asignacionServicioService.update(id, dto);
        return ResponseEntity.ok(obj);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        asignacionServicioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}