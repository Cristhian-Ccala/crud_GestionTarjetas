package gestionTarjetas.Gestion_Tarjetas.services;

import gestionTarjetas.Gestion_Tarjetas.entity.Tarjeta;

import java.util.List;

public interface TarjetaService {
    Tarjeta save(Tarjeta tarjeta);
    List<Tarjeta> findAll();
    Tarjeta findById(Integer id);
    void deleteById(Integer id);
    Tarjeta update(Tarjeta tarjeta);
}
