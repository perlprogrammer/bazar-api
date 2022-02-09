package local.bazar.backend.bazarapi;

import local.bazar.backend.bazarapi.model.Gob;
import local.bazar.backend.bazarapi.service.GobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gob")
public class GobResource {
    private final GobService gobService;

    public GobResource(GobService gobService){
        this.gobService = gobService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Gob>> getAllGobs(){
        List<Gob> gobs = gobService.findAllGobs();
        return new ResponseEntity<>(gobs, HttpStatus.OK);
    }
}
