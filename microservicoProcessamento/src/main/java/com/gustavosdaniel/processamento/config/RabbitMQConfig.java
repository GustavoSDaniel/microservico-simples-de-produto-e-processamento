package com.gustavosdaniel.processamento.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // CONFIGURAÇÃO PADRAO PARA RECEBER DADOS DENTRO DE UMA FILA
public class RabbitMQConfig {
    @Value("${broker.queue.processamento.name}")
    private String queue;

    @Bean
    public Queue queueProcessamento() {
        return new Queue(queue, true);
    }

    @Bean
    public Jackson2JsonMessageConverter jsonMessageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}
