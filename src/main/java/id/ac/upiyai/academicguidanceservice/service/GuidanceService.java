package id.ac.upiyai.academicguidanceservice.service;

import id.ac.upiyai.academicguidanceservice.repository.GuidanceRepository;
import org.springframework.stereotype.Service;

@Service
public class GuidanceService {

    private final GuidanceRepository repository;

    public GuidanceService(GuidanceRepository repository) {
        this.repository = repository;
    }
}
