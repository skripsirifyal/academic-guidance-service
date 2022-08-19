package id.ac.upiyai.academicguidanceservice.repository;

import id.ac.upiyai.academicguidanceservice.model.Purpose;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurposeRepository extends CrudRepository<Purpose, Integer> {
    List<Purpose> findAllByIsActive(Boolean isActive);
}
