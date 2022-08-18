package id.ac.upiyai.academicguidanceservice.controller;

import id.ac.upiyai.academicguidanceservice.service.GuidanceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guidances")
public class GuidanceController {

    private final GuidanceService service;

    public GuidanceController(GuidanceService service) {
        this.service = service;
    }
}
