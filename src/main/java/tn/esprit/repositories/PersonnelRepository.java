package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Personnel;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Integer> {

}
