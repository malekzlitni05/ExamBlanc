package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Parking;
@Repository
public interface ParkingRepository extends JpaRepository<Parking, Integer> {
}
