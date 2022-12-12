package tn.esprit.controllers;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Parking;
import tn.esprit.entities.Personnel;
import tn.esprit.entities.Zone;
import tn.esprit.repositories.ParkingRepository;
import tn.esprit.repositories.PersonnelRepository;
import tn.esprit.repositories.ZoneRepository;

@Slf4j
@RestController
@RequestMapping("rest")





public class ExamRestController {
    @Autowired
    PersonnelRepository personnelRepository;

    @Autowired
    ParkingRepository parkingRepository;

    @Autowired
    ZoneRepository zoneRepository;

    @PostMapping("/addPersonnel")
    public Personnel AjouterPersonnel(@RequestBody Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    @PostMapping("/ajoutParkingetZones")
    public void ajoutParkingetZones(@RequestBody Parking parking){
        List <Zone> zones = parking.getZones();
        zones.stream().forEach(zone -> zone.setParking(parking));
        parking.setZones(parking.getZones());
        parkingRepository.save(parking);

        zoneRepository.saveAll(parking.getZones());
    }

    @PutMapping("/affecterPersonnelZone/{idZone}/{idGarde}")
    public void AffecterPersonnelZone(@RequestBody Personnel p, @PathVariable Integer idZone, @PathVariable Integer idGarde) {

        return personnelRepository.findByPersonnelZoneidAnd(p, idZone, idGarde);

    }



    @GetMapping("/getAllPersonnelParking")
    public List<Personnel> getAllPersonnelByParking(@RequestBody Parking parking) {
        Parking parking1 = parkingRepository.findById(parking.getId()).orElse(null);
        List<Zone> zones = parking1.getZones();
        List<Personnel> personnels=new ArrayList<Personnel>();


        return ParkingRepository.);
    }

    @GetMapping("/getPersonnel/{startDate}/{endDate}")
    public List <Personnel> getPersonalByDate (@PathVariable Integer idPersonnel,
                                @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {


        Personnel personnel = personnelRepository.findById(idPersonnel).orElse(null);
        return personnel ;
    }





}











