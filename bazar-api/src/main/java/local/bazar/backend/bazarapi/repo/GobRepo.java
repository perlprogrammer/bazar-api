package local.bazar.backend.bazarapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GobRepo extends JpaRepository<Gob, Long> {

    void deleteGobById(Long id);

    Optional<Gob> findBGobyId(Long id);
}
