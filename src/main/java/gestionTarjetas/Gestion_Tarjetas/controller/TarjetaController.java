package gestionTarjetas.Gestion_Tarjetas.controller;

import gestionTarjetas.Gestion_Tarjetas.entity.Tarjeta;
import gestionTarjetas.Gestion_Tarjetas.services.TarjetaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
// http://localhost:8080/api/tarjetas
@RequestMapping("/api/tarjetas")
public class TarjetaController {

    private final TarjetaService tarjetaService;

    public TarjetaController(TarjetaService tarjetaService) {
        this.tarjetaService = tarjetaService;
    }

    // http://localhost:8080/api/tarjetas
    @PostMapping()
    public Tarjeta save(@RequestBody Tarjeta tarjeta){
        return tarjetaService.save(tarjeta);
    }

    // http://localhost:8080/api/tarjetas
    @GetMapping
    public List<Tarjeta> findAll(){
        return tarjetaService.findAll();
    }

    // http://localhost:8080/api/tarjetas/2
    @GetMapping("/{id}")
    public Tarjeta findById(@PathVariable Integer id){
        return tarjetaService.findById(id);
    }

    // http://localhost:8080/api/tarjetas/2
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        tarjetaService.deleteById(id);
    }

    // http://localhost:8080/api/tarjetas
    @PutMapping
    public Tarjeta updateTarjeta(@RequestBody Tarjeta tarjeta){
        Tarjeta tarjetaDb = tarjetaService.findById(tarjeta.getId_tarjeta());
        tarjetaDb.setNombre(tarjeta.getNombre());
        tarjetaDb.setTipo(tarjeta.getTipo());
        tarjetaDb.setNum_tarjeta(tarjeta.getNum_tarjeta());
        tarjetaDb.setCvv(tarjeta.getCvv());
        tarjetaDb.setEstado(tarjeta.getEstado());
        return tarjetaService.update(tarjeta);
    }
}
