package buzens.benoit.demo.domain.services;
import buzens.benoit.demo.applicationInterfaces.PersonalProtectiveEquipementItemsInterface;
import buzens.benoit.demo.domain.model.PersonalProtectiveEquipementItem;
import buzens.benoit.demo.technicalInterfaces.PersonalProtectiveEquipementItemsEntity;
import buzens.benoit.demo.technicalInterfaces.PersonalProtectiveEquipementItemsRepository;
import buzens.benoit.demo.technicalInterfaces.PersonalProtectiveEquipmentItemsMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonalProtectiveEquipementItemsServices implements PersonalProtectiveEquipementItemsInterface {
    private final PersonalProtectiveEquipementItemsRepository personalProtectiveEquipementItemsRepository;

    public PersonalProtectiveEquipementItemsServices(PersonalProtectiveEquipementItemsRepository personalProtectiveEquipementItemsRepository) {
        this.personalProtectiveEquipementItemsRepository = personalProtectiveEquipementItemsRepository;
    }

    public ArrayList<PersonalProtectiveEquipementItem> getPersonalProtectiveEquipementItemsService(){
        //ArrayList<PersonalProtectiveEquipementItem> personalProtectiveEquipementItems = new ArrayList<PersonalProtectiveEquipementItem>(personalProtectiveEquipementItemsRepository.findAll());
        List<PersonalProtectiveEquipementItemsEntity> personalProtectiveEquipementItemsEntities=personalProtectiveEquipementItemsRepository.findAll();
        ArrayList<PersonalProtectiveEquipementItem> personalProtectiveEquipementItems = new ArrayList<PersonalProtectiveEquipementItem>(personalProtectiveEquipementItemsEntities.stream().map(PersonalProtectiveEquipmentItemsMapper::toDomain).toList());
        return personalProtectiveEquipementItems;
    }

}
