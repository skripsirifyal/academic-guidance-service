package id.ac.upiyai.academicguidanceservice.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "supports")
@Proxy(lazy = false)
public class Support implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "support_id")
    private Integer supportId;

    @Column(name = "support_name", nullable = false, length = 100)
    private String supportName;

    @Column(name = "is_active")
    private Boolean isActive;
}
