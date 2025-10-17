package buzens.benoit.demo.domain.services;
import buzens.benoit.demo.applicationInterfaces.PersonalProtectiveEquipementItemsInterface;
import buzens.benoit.demo.domain.model.PersonalProtectiveEquipementItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonalProtectiveEquipementItemsServices implements PersonalProtectiveEquipementItemsInterface {
    public ArrayList<PersonalProtectiveEquipementItem> getPersonalProtectiveEquipementItemsService(){
        ArrayList<PersonalProtectiveEquipementItem> personalProtectiveEquipementItems = new ArrayList<>();
        personalProtectiveEquipementItems.add(new PersonalProtectiveEquipementItem());
        return personalProtectiveEquipementItems;
    }

}
