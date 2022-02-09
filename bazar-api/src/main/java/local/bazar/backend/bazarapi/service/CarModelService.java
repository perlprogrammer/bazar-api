package local.bazar.backend.bazarapi.service;

import local.bazar.backend.bazarapi.exception.UserNotFoundException;
import local.bazar.backend.bazarapi.model.CarModel;
import local.bazar.backend.bazarapi.repo.CarModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelService {
    private final CarModelRepo carModelRepo;

    @Autowired
    public CarModelService(CarModelRepo carModelRepo)
    {
        this.carModelRepo = carModelRepo;
    }

    public CarModel addCarModel(CarModel carModel)
    {
        return carModelRepo.save(carModel);
    }

    public List<CarModel> findAllCarmodels()
    {
        return carModelRepo.findAll();
    }

    public CarModel updateCarModel(CarModel carModel)
    {
        return carModelRepo.save(carModel);
    }

    public CarModel findCarModelById(Long id)
    {
        return carModelRepo.findCarModelById(id).orElseThrow(()-> new UserNotFoundException("Car model by id" + id + "Not found"));
    }

    public void deleteCarModel(Long id)
    {
        carModelRepo.deleteCarModelById(id);
    }

}
