package br.com.dio.warehouse.service.impl;

import br.com.dio.warehouse.dto.StockStatusMessage;
import br.com.dio.warehouse.service.IProductChangeAvailabilityProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProductChangeAvailabilityProducerImpl implements IProductChangeAvailabilityProducer {

    private final RabbitTemplate rabbitTemplate;
    private final String exchangeName;
    private final String routingKeyName;

    public ProductChangeAvailabilityProducerImpl( @Value("${spring.rabbitmq.exchange.product-change-availability}")
                                                  final String exchangeName,
                                                  @Value("${spring.rabbitmq.routing-key.product-change-availability}")
                                                  final String routingKeyName,
                                                  final RabbitTemplate rabbitTemplate) {
        this.exchangeName = exchangeName;
        this.routingKeyName = routingKeyName;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void notifyStatusChange(StockStatusMessage message) {
        rabbitTemplate.convertAndSend(exchangeName, routingKeyName, message);
    }
}
