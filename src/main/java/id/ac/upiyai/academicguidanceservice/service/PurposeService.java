package id.ac.upiyai.academicguidanceservice.service;

import id.ac.upiyai.academicguidanceservice.repository.PurposeRepository;
import org.springframework.stereotype.Service;

@Service
public class PurposeService {

    private final PurposeRepository repository;

    public PurposeService(PurposeRepository repository) {
        this.repository = repository;
    }
}
