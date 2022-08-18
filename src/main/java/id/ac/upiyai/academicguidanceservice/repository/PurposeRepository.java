package id.ac.upiyai.academicguidanceservice.repository;

import id.ac.upiyai.academicguidanceservice.model.Purpose;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurposeRepository extends CrudRepository<Purpose, Integer> {
}
