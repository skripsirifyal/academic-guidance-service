package id.ac.upiyai.academicguidanceservice.controller;

import id.ac.upiyai.academicguidanceservice.payload.SupportRequest;
import id.ac.upiyai.academicguidanceservice.service.SupportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/supports")
public class SupportController {

    private final SupportService service;

    public SupportController(SupportService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> addDataSupport(@Valid @RequestBody SupportRequest request) {
        service.addDataSupport(request);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        return new ResponseEntity<>(service.getAllData(), HttpStatus.OK);
    }
}
