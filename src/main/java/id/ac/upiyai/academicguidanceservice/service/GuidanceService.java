package id.ac.upiyai.academicguidanceservice.service;

import id.ac.upiyai.academicguidanceservice.model.Guidance;
import id.ac.upiyai.academicguidanceservice.repository.GuidanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuidanceService {

    private final GuidanceRepository repository;

    public GuidanceService(GuidanceRepository repository) {
        this.repository = repository;
    }

    public List<Guidance> getAllData() {
        return repository.findAll();
    }
}
