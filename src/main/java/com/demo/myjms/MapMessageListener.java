package com.demo.myjms;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

public class MapMessageListener implements MessageListener 
{
	public void onMessage(Message message)
	{
		if (message instanceof MapMessage)
		{
			MapMessage mapMessage = (MapMessage)message;
			
			try
			{
				String name = mapMessage.getString("Name");
				String role = mapMessage.getString("Role");
				String salary = mapMessage.getString("Salary");
				System.out.println("Name : " + name+"\t"+"ROLE: "+role+"Salary:"+salary);
			}
			catch (JMSException e)
			{
				throw new RuntimeException(e);
			}
		}
		else
		{
			System.out.println("Invalid Message Received");
		}
	}

}
