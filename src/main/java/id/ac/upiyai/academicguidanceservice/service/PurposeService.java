package id.ac.upiyai.academicguidanceservice.service;

import id.ac.upiyai.academicguidanceservice.model.Purpose;
import id.ac.upiyai.academicguidanceservice.payload.PurposeRequest;
import id.ac.upiyai.academicguidanceservice.repository.PurposeRepository;
import org.springframework.stereotype.Service;

@Service
public class PurposeService {

    private final PurposeRepository repository;

    public PurposeService(PurposeRepository repository) {
        this.repository = repository;
    }

    public void addDataPurpose(PurposeRequest request) {
        Purpose purpose = new Purpose();
        purpose.setPurposeName(request.getPurposeName());
        purpose.setIsActive(true);
        repository.save(purpose);
    }
}
