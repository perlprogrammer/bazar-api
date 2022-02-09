package local.bazar.backend.bazarapi.service;

import local.bazar.backend.bazarapi.exception.UserNotFoundException;
import local.bazar.backend.bazarapi.model.Make;
import local.bazar.backend.bazarapi.repo.MakeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakeService {

    private final MakeRepo makeRepo;

    public MakeService(MakeRepo makeRepo){
        this.makeRepo = makeRepo;
    }

    public Make addMake (Make make){
        return makeRepo.save(make);
    }

    public List<Make> findAllMakes(){
        return makeRepo.findAll();
    }

    public Make updateMake(Make make){
        return makeRepo.save(make);
    }

    public Make findMakeById(Long id){
        return makeRepo.findMakeById(id).orElseThrow(() ->new UserNotFoundException("Make by ID"+ id +"Not found"));
    }

    public void deleteMake(Long id){
        makeRepo.deleteMakeById(id);
    }
}
