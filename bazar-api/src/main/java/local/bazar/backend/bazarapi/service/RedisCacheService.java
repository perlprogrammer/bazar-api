package local.bazar.backend.bazarapi.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "mySpecialCache")
    public String longRunningMethod() throws InterruptedException{

        Thread.sleep(5000L);
        return "Method running";
    }
}
