package id.ac.upiyai.academicguidanceservice.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "purposes")
@Proxy(lazy = false)
public class Purpose implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purpose_id")
    private Integer purposeId;

    @Column(name = "purpose_name", nullable = false, length = 100)
    private String purposeName;

    @Column(name = "is_active")
    private Boolean isActive;
}
