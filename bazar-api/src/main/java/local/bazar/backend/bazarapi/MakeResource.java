package local.bazar.backend.bazarapi;

import local.bazar.backend.bazarapi.model.Make;
import local.bazar.backend.bazarapi.service.MakeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/make")
public class MakeResource {

    private final MakeService makeService;

    public MakeResource(MakeService makeService){
        this.makeService = makeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Make>> getAllMakes(){

        List<Make> makes = makeService.findAllMakes();
        return  new ResponseEntity<>(makes, HttpStatus.OK);
    }
}
