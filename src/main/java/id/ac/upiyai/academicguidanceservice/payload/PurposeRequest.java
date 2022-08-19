package id.ac.upiyai.academicguidanceservice.payload;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PurposeRequest implements Serializable {
    private String purposeName;
}
