package team.rest.visionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.rest.visionservice.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
