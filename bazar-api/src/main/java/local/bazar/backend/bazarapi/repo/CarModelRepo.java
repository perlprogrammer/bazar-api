package local.bazar.backend.bazarapi.repo;

import local.bazar.backend.bazarapi.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarModelRepo extends JpaRepository<CarModel, Long> {

    void deleteCarModelById(Long id);
    Optional<CarModel> findCarModelById(Long id);

}
