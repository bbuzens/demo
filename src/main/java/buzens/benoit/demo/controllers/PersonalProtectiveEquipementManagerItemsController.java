package buzens.benoit.demo.controllers;

import buzens.benoit.demo.applicationInterfaces.PersonalProtectiveEquipementItemsInterface;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class PersonalProtectiveEquipementManagerItemsController {
    Logger logger = LoggerFactory.getLogger(PersonalProtectiveEquipementManagerItemsController.class);

    private final PersonalProtectiveEquipementItemsInterface personalProtectiveEquipementItemsInterface;

    public PersonalProtectiveEquipementManagerItemsController(PersonalProtectiveEquipementItemsInterface personalProtectiveEquipementItemsInterface) {
        this.personalProtectiveEquipementItemsInterface = personalProtectiveEquipementItemsInterface;
    }

    @Operation(summary = "Retourner tous les items connus et leurs informations")
    @GetMapping("/get")
    public String getPersonalProtectiveEquipementItems(){
        logger.info("getItems");
        return personalProtectiveEquipementItemsInterface.getPersonalProtectiveEquipementItemsService().toString();
    }
}
