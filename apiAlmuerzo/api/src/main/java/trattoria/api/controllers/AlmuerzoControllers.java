package trattoria.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import trattoria.api.models.Almuerzo;
import trattoria.api.services.AlmuerzoServices;

@Controller
public class AlmuerzoControllers {
    @Autowired
    private AlmuerzoServices almuerzoServices;

    @PostMapping("api/registrar")
    public Almuerzo registrarMenu(@RequestBody Almuerzo almuerzo) {
        almuerzoServices.registrarAlmuerzo(almuerzo);

        return almuerzo;
    }

    @PutMapping("api/editar/{id}")
    public ResponseEntity<?> editarMenu(@RequestBody Almuerzo almuerzo) {
        try {
            almuerzoServices.editarAlmuerzo(almuerzo);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body("Menu editado correctamente");

    }

    @DeleteMapping ("api/eliminar")
    public ResponseEntity<?> eliminarMenu(@RequestBody Almuerzo almuerzo) {
        try {
            almuerzoServices.eliminarAlmuerzo(almuerzo);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body("Menu eliminado correctamente");

    }

    //Belfor
    @GetMapping ("/landing")
    public String showLanding(Model model) {
        model.addAttribute("almuerzos", almuerzoServices.mostrarAlmuerzo());
        return "index";
    }
}