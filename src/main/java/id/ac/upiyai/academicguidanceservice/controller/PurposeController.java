package id.ac.upiyai.academicguidanceservice.controller;

import id.ac.upiyai.academicguidanceservice.payload.PurposeRequest;
import id.ac.upiyai.academicguidanceservice.service.PurposeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/purposes")
public class PurposeController {

    private final PurposeService service;

    public PurposeController(PurposeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> addDataPropose(@Valid @RequestBody PurposeRequest request) {
        service.addDataPurpose(request);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        return new ResponseEntity<>(service.getAllData(), HttpStatus.OK);
    }
}
