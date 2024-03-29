package com.demo.myjms;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.naming.InitialContext;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageReceiver {
	public static void main(String[] args) {
		try {
			InitialContext ctx = new InitialContext();

			ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");

			Connection connection = cf.createConnection();

			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			Destination destination = session.createQueue("test.message.queue");

			MessageConsumer consumer = session.createConsumer(destination);

			consumer.setMessageListener(new MapMessageListener());
			connection.start();
			
			//connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	

	}
}