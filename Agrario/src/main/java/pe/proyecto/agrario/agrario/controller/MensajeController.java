package pe.proyecto.agrario.agrario.controller;



import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.proyecto.agrario.agrario.modelo.Mensaje;
import pe.proyecto.agrario.agrario.service.IMensajeService;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mensaje")
public class MensajeController {
    private final IMensajeService mensajeService;
    @GetMapping
    public ResponseEntity<List<Mensaje>> findAll() {
        List<Mensaje> list = mensajeService.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mensaje> findById(@PathVariable("id") Long
                                                       id) {
        Mensaje obj = mensajeService.findById(id);
        return ResponseEntity.ok(obj);
    }
    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody Mensaje dto) {
        Mensaje obj = mensajeService.save(dto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(
                obj.getIdMensaje()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Mensaje> update(@PathVariable("id") Long
                                                     id, @RequestBody
    Mensaje dto) {
        dto.setIdMensaje(id);
        Mensaje obj = mensajeService.update(id, dto);
        return ResponseEntity.ok(obj);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        mensajeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}