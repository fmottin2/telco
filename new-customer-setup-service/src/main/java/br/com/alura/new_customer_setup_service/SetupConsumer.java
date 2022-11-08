package br.com.alura.new_customer_setup_service;

import java.util.HashMap;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import br.com.alura.commons_kafka.KafkaService;

public class SetupConsumer {
	public static void main(String[] args) {
		var setupCustomer =  new SetupConsumer();
		var service =  new KafkaService("new-customer-setup-service",
				"NEW_CUSTOMER", 
				setupCustomer::parse,
				Customer.class,
				new HashMap<>());
		 service.run();
	}
	
	private void parse(ConsumerRecord<String, Customer> record) {
		System.out.println("-------------------------------------------");
		System.out.println("Agendando instalação...");
		System.out.println(record.key());
		System.out.println(record.value());
		System.out.println(record.partition());
		System.out.println(record.offset());
		
		System.out.println("Instalação realizada com sucesso");
	}
}
