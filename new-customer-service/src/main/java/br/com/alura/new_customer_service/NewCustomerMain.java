package br.com.alura.new_customer_service;

import java.util.concurrent.ExecutionException;

import br.com.alura.commons_kafka.KafkaDispatcher;

public class NewCustomerMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		try (var orderDispatcher = new KafkaDispatcher<Customer>()) {
			for (var i = 0; i < 10; i++) {
				var email = "joao@email.com";
				var customer = new Customer("João Santos", email, "1195457852", "Rua XV de Novembro", "São Paulo");
				orderDispatcher.send("NEW_CUSTOMER", email, customer);
			}
		}
	}
}
