package buzens.benoit.demo.services.implementations;

import buzens.benoit.demo.model.PersonalProtectiveEquipementItem;
import buzens.benoit.demo.services.PersonalProtectiveEquipementItemsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonalProtectiveEquipementItemsServiceImplementation implements PersonalProtectiveEquipementItemsService {
    public ArrayList<PersonalProtectiveEquipementItem> getPersonalProtectiveEquipementItemsService(){
        ArrayList<PersonalProtectiveEquipementItem> personalProtectiveEquipementItems = new ArrayList<>();
        personalProtectiveEquipementItems.add(new PersonalProtectiveEquipementItem());
        return personalProtectiveEquipementItems;
    }

}
