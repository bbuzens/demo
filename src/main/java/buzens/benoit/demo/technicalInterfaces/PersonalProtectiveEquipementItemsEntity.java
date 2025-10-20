package buzens.benoit.demo.technicalInterfaces;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class PersonalProtectiveEquipementItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String type;
    private String manufacturer;
    private String model;
    private LocalDate manufactureDate;
    private LocalDate firstUseDate;

    // Getters, setters, constructeur vide
}