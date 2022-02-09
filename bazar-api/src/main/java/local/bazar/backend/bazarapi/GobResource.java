package local.bazar.backend.bazarapi;

import local.bazar.backend.bazarapi.model.Gob;
import local.bazar.backend.bazarapi.service.GobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/find/{id}")
    public ResponseEntity<Gob> getGobById(@PathVariable("id") Long id){
        Gob gob = gobService.findGobById(id);
        return new ResponseEntity<>(gob, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Gob> addGob(@RequestBody Gob gob){
        Gob newGob = gobService.addGob(gob);
        return new ResponseEntity<>(newGob, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Gob> updateGob(@RequestBody Gob gob){
        Gob updateGob = gobService.updateGob(gob);

        return new ResponseEntity<>(updateGob, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteGob(@PathVariable("id") Long id){
        gobService.deleteGob(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}








