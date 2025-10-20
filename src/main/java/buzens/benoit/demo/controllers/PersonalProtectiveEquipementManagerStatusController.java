package buzens.benoit.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalProtectiveEquipementManagerStatusController {
    Logger logger = LoggerFactory.getLogger(PersonalProtectiveEquipementManagerStatusController.class);

    @GetMapping(value = "/status")
    public String status() {
        logger.info("Status");
        return "OK";
    }
}
