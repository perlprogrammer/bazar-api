package local.bazar.backend.bazarapi.service;

import local.bazar.backend.bazarapi.exception.UserNotFoundException;
import local.bazar.backend.bazarapi.model.Gob;
import local.bazar.backend.bazarapi.repo.GobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GobService {

    private  final GobRepo gobRepo;

    @Autowired
    public GobService(GobRepo gobRepo){
        this.gobRepo = gobRepo;
    }

    public Gob addGob(Gob gob){

        return gobRepo.save(gob);
    }

    public List<Gob> findAllGobs(){
        return gobRepo.findAll();
    }

    public Gob updateGob(Gob gob){
        return gobRepo.save(gob);
    }

    public Gob findGobById(Long id){
        return gobRepo.findBGobyId(id).orElseThrow(()-> new UserNotFoundException("Gob by id " + id +" was not found"));
    }

    public void deleteGob(Long id){
        gobRepo.deleteGobById(id);
    }

}
