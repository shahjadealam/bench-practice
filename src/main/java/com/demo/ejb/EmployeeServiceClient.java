package com.demo.ejb;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class EmployeeServiceClient {

	public static void main(String[] a) throws Exception {

		/*
		 * 
		 * Connecting to JBoss naming service running on local host and on
		 * 
		 * default port 1099 the environment that should be created is like the
		 * 
		 * one shown below :
		 * 
		 */

		Hashtable env = new Hashtable();

		env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");

		env.put(Context.PROVIDER_URL, "jnp://localhost:1099");

		env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");

		Context ctx = new InitialContext(env);

		// We get a reference of the remote EJB interface to invoke its business methods

		EmployeeServiceLocal employeeService = new EmployeeService();
		Employee employee = employeeService.createEmployee("Byron", "Kiourtzoglou", "Master Software Engineer", 2000d);

		long employeeId = employee.getId();

		System.out.println(employeeService.findEmployee(employeeId));

		employeeService.promoteEmployee(employeeId, "Principal Software Engineer", 3000d);

		System.out.println(employeeService.findEmployee(employeeId));

	}

}