package gestionTarjetas.Gestion_Tarjetas.repository;

import gestionTarjetas.Gestion_Tarjetas.entity.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaRepository extends JpaRepository <Tarjeta, Integer> {
}
