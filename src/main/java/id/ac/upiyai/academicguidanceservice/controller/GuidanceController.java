package id.ac.upiyai.academicguidanceservice.controller;

import id.ac.upiyai.academicguidanceservice.payload.GuidanceRequest;
import id.ac.upiyai.academicguidanceservice.service.GuidanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/guidances")
public class GuidanceController {

    private final GuidanceService service;

    public GuidanceController(GuidanceService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> addDataGuidance(@Valid @RequestBody GuidanceRequest request) {
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        return new ResponseEntity<>(service.getAllData(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateDataGuidance(@Valid @RequestBody GuidanceRequest request) {
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
