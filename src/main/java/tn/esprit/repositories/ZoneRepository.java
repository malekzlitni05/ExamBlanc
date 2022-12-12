package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Zone;
@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer> {
}
