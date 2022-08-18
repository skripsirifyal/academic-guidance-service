package id.ac.upiyai.academicguidanceservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import id.ac.upiyai.academicguidanceservice.model.audit.UserDateAudit;
import id.ac.upiyai.academicguidanceservice.util.KindEnum;
import id.ac.upiyai.academicguidanceservice.util.TypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "guidances")
public class Guidance extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guidanceId;

    @Column(name = "guidance_date")
    private LocalDate guidanceDate;

    @Column(name = "guidance_problem")
    private String guidanceProblem;

    @Column(name = "guidance_solution")
    private String guidanceSolution;

    @Enumerated(EnumType.STRING)
    @Column(name = "guidance_kind")
    private KindEnum guidanceKind;

    @Enumerated(EnumType.STRING)
    @Column(name = "guidance_type")
    private TypeEnum guidanceType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "purpose_id", nullable = false)
    @JsonIgnore
    private Purpose purpose;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "support_id", nullable = false)
    @JsonIgnore
    private Support support;
}
