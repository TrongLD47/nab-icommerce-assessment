package au.com.nab.icommerce.cart.mapper;

import au.com.nab.icommerce.cart.domain.Item;
import au.com.nab.icommerce.cart.protobuf.PItem;
import au.com.nab.icommerce.common.mapper.AbstractProtobufMapper;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper extends AbstractProtobufMapper<Item, PItem> {

    @Override
    public Item toDomain(PItem protobuf) {
        Item entity = new Item();
        entity.setProductId(protobuf.getProductId());
        entity.setQuantity(protobuf.getQuantity());
        entity.setDateTime(protobuf.getDateTime());

        return entity;
    }

    @Override
    public PItem toProtobuf(Item entity) {
        PItem.Builder protobuf = PItem.newBuilder();
        protobuf.setProductId(entity.getProductId());
        protobuf.setQuantity(entity.getQuantity());
        protobuf.setDateTime(entity.getDateTime());

        return protobuf.build();
    }
}
