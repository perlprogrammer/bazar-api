package local.bazar.backend.bazarapi;

import local.bazar.backend.bazarapi.model.CarModel;
import local.bazar.backend.bazarapi.service.CarModelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carmodel")
public class CarModelResource {

    private final CarModelService carModelService;

    public CarModelResource(CarModelService carModelService)
    {
        this.carModelService = carModelService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CarModel>> getAllCarModels()
    {
        List<CarModel> carModels = carModelService.findAllCarmodels();

        return new ResponseEntity<>(carModels, HttpStatus.OK);
    }

}

