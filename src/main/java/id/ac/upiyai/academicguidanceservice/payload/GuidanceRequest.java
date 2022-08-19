package id.ac.upiyai.academicguidanceservice.payload;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class GuidanceRequest implements Serializable {
    private LocalDate guidanceDate;
    private String guidanceProblem;
    private String guidanceSolution;
    private String guidanceKind;
    private String guidanceType;
    private Integer purposeId;
    private Integer supportId;
}
