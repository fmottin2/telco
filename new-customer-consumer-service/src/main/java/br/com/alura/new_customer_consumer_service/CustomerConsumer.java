package br.com.alura.new_customer_consumer_service;

import java.util.HashMap;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import br.com.alura.commons_kafka.KafkaService;

public class CustomerConsumer {
	public static void main(String[] args) {
		var customerConsumer =  new CustomerConsumer();
		var service =  new KafkaService("new-customer-consumer-service",
				"NEW_CUSTOMER", 
				customerConsumer::parse,
				Customer.class,
				new HashMap<>());
		 service.run();
	}
	
	private void parse(ConsumerRecord<String, Customer> record) {
		System.out.println("-------------------------------------------");
		System.out.println("Cadastrando usuário...");
		System.out.println(record.key());
		System.out.println(record.value());
		System.out.println(record.partition());
		System.out.println(record.offset());
		
		System.out.println("Usuário cadastrado.");
	}
}
