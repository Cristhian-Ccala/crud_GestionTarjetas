package gestionTarjetas.Gestion_Tarjetas.services;

import gestionTarjetas.Gestion_Tarjetas.entity.Tarjeta;
import gestionTarjetas.Gestion_Tarjetas.exection.ResourceNotFoundException;
import gestionTarjetas.Gestion_Tarjetas.repository.TarjetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaServiceImpl implements TarjetaService {

    private final TarjetaRepository tarjetaRepository;

    public TarjetaServiceImpl(TarjetaRepository tarjetaRepository) {
        this.tarjetaRepository = tarjetaRepository;
    }

    @Override
    public Tarjeta save(Tarjeta tarjeta) {
        return tarjetaRepository.save(tarjeta);
    }

    @Override
    public List<Tarjeta> findAll() {
        return tarjetaRepository.findAll();
    }

    @Override
    public Tarjeta findById(Integer id) {
        Tarjeta tarjeta = tarjetaRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("No se encuentra la tarjeta con el id "+id);
                }
        );
        return tarjeta;
    }

    @Override
    public void deleteById(Integer id) {
        tarjetaRepository.deleteById(id);
    }

    @Override
    public Tarjeta update(Tarjeta tarjeta) {
        return tarjetaRepository.save(tarjeta);
    }
}
