package buzens.benoit.demo.controllers;

import buzens.benoit.demo.services.PersonalProtectiveEquipementItemsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class PersonalProtectiveEquipementManagerItemsController {
    Logger logger = LoggerFactory.getLogger(PersonalProtectiveEquipementManagerItemsController.class);

    private final PersonalProtectiveEquipementItemsService personalProtectiveEquipementItemsService;

    public PersonalProtectiveEquipementManagerItemsController(PersonalProtectiveEquipementItemsService personalProtectiveEquipementItemsService) {
        this.personalProtectiveEquipementItemsService = personalProtectiveEquipementItemsService;
    }

    @GetMapping("/get")
    public String getPersonalProtectiveEquipementItems(){
        logger.info("getItems");
        return personalProtectiveEquipementItemsService.getPersonalProtectiveEquipementItemsService().toString();
    }
}
