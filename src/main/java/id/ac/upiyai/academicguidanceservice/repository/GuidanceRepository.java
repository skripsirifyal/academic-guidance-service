package id.ac.upiyai.academicguidanceservice.repository;

import id.ac.upiyai.academicguidanceservice.model.Guidance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GuidanceRepository extends JpaRepository<Guidance, UUID> {
}
