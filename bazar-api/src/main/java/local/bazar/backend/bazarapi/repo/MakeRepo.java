package local.bazar.backend.bazarapi.repo;


import local.bazar.backend.bazarapi.model.Make;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MakeRepo extends JpaRepository<Make, Long> {

    void deleteMakeById(Long id);

    Optional<Make> findMakeById(Long id);
}
