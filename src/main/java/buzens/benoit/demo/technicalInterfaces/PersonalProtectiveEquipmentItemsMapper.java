package buzens.benoit.demo.technicalInterfaces;

import buzens.benoit.demo.domain.model.PersonalProtectiveEquipementItem;

public class PersonalProtectiveEquipmentItemsMapper {
    public static PersonalProtectiveEquipementItem toDomain(PersonalProtectiveEquipementItemsEntity personalProtectiveEquipementItemsEntity){
        return new PersonalProtectiveEquipementItem(
                personalProtectiveEquipementItemsEntity.getId().toString(),
                personalProtectiveEquipementItemsEntity.getStatus(),
                personalProtectiveEquipementItemsEntity.getType(),
                personalProtectiveEquipementItemsEntity.getManufacturer(),
                personalProtectiveEquipementItemsEntity.getModel(),
                personalProtectiveEquipementItemsEntity.getManufactureDate(),
                personalProtectiveEquipementItemsEntity.getFirstUseDate()
        );
    }

    public static PersonalProtectiveEquipementItemsEntity toEntity(PersonalProtectiveEquipementItem personalProtectiveEquipementItem){
        PersonalProtectiveEquipementItemsEntity personalProtectiveEquipementItemsEntity=new PersonalProtectiveEquipementItemsEntity();
        personalProtectiveEquipementItemsEntity.setId(Long.valueOf(personalProtectiveEquipementItem.itemId()));
        personalProtectiveEquipementItemsEntity.setStatus(personalProtectiveEquipementItem.itemStatus());
        personalProtectiveEquipementItemsEntity.setType(personalProtectiveEquipementItem.itemType());
        personalProtectiveEquipementItemsEntity.setManufacturer(personalProtectiveEquipementItem.itemManufacturer());

        return personalProtectiveEquipementItemsEntity;
    }
}
