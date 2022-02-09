package local.bazar.backend.bazarapi.repo;


import local.bazar.backend.bazarapi.model.Gob;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GobRepo extends JpaRepository<Gob, Long> {

    void deleteGobById(Long id);
    Optional<Gob> findGobById(Long id);
}