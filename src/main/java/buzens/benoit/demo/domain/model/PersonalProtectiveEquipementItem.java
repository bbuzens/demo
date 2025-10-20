package buzens.benoit.demo.domain.model;

import java.time.LocalDate;

public record PersonalProtectiveEquipementItem (String itemId, String itemStatus, String itemType, String itemManufacturer, String itemModel, LocalDate manufactureDate, LocalDate firstUseDate) {
}
