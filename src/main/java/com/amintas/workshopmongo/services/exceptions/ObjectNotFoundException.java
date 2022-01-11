package com.amintas.workshopmongo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(Object id) {
		super("Resource not found, ID" + id);
	}
}
