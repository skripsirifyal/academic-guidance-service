package id.ac.upiyai.academicguidanceservice.service;

import id.ac.upiyai.academicguidanceservice.model.Support;
import id.ac.upiyai.academicguidanceservice.payload.SupportRequest;
import id.ac.upiyai.academicguidanceservice.repository.SupportRepository;
import org.springframework.stereotype.Service;

@Service
public class SupportService {

    private final SupportRepository repository;

    public SupportService(SupportRepository repository) {
        this.repository = repository;
    }

    public void addDataSupport(SupportRequest request) {
        Support support = new Support();
        support.setSupportName(request.getSupportName());
        support.setIsActive(true);
        repository.save(support);
    }
}
