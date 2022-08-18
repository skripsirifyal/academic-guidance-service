package id.ac.upiyai.academicguidanceservice.controller;

import id.ac.upiyai.academicguidanceservice.service.PurposeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purposes")
public class PurposeController {

    private final PurposeService service;

    public PurposeController(PurposeService service) {
        this.service = service;
    }
}
