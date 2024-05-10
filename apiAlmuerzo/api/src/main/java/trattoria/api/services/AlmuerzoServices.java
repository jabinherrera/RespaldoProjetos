package trattoria.api.services;

import trattoria.api.models.Almuerzo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trattoria.api.repositories.AlmuerzoRepository;

import java.util.List;


@Service
public class AlmuerzoServices {
    @Autowired
    private AlmuerzoRepository almuerzoRepository;

    public void registrarAlmuerzo(Almuerzo almuerzo) {
        almuerzoRepository.save(almuerzo);
    }

    public void editarAlmuerzo(Almuerzo almuerzo) {

        almuerzoRepository.save(almuerzo);
    }

    public void eliminarAlmuerzo(Almuerzo almuerzo) { almuerzoRepository.delete(almuerzo);}

    //Belfor
    public List<Almuerzo> mostrarAlmuerzo() {
        return almuerzoRepository.findAll();
    }

}
