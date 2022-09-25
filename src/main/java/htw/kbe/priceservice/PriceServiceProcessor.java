package htw.kbe.priceservice;



import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class PriceServiceProcessor {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public double recieveMessage(List<htw.kbe.priceservice.Component>  request){

        return calculatePrice(request);
    }

    public double calculatePrice(List<htw.kbe.priceservice.Component> product){

        double price = 0;
        for (htw.kbe.priceservice.Component c:
             product) {
            price += c.getPrice();
        }
        System.out.println(price);
        return price;
    }

}
