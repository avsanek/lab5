package lab5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab5.entity.Specialty;
import lab5.service.specialtyService;

@RestController
@RequestMapping("api/specialty")
public class SpecialtyController extends AbstractController<Specialty> {

    @Autowired
    private specialtyService service;

    @Override
    public specialtyService getService() {
        return service;
    }

    @GetMapping("/cod_spec/{cod_spec}")
    public ResponseEntity<Specialty> getspecialtyBycod_spec(@PathVariable String cod_spec) {
        Specialty specialty = service.readBycod_spec(cod_spec);
        if (specialty == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(specialty, headers, HttpStatus.OK);
    }

}
