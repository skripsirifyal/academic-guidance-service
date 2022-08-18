package id.ac.upiyai.academicguidanceservice.repository;

import id.ac.upiyai.academicguidanceservice.model.Support;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportRepository extends CrudRepository<Support, Integer> {
}
