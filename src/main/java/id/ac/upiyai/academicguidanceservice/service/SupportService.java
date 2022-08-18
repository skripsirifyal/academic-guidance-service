package id.ac.upiyai.academicguidanceservice.service;

import id.ac.upiyai.academicguidanceservice.repository.SupportRepository;
import org.springframework.stereotype.Service;

@Service
public class SupportService {

    private final SupportRepository repository;

    public SupportService(SupportRepository repository) {
        this.repository = repository;
    }
}
