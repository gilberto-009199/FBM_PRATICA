package com.fbm.store.api.controllers.responses;

import jakarta.annotation.sql.DataSourceDefinitions;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message<T> {
	
	public boolean status;
	public T data;
	
	public static Message of(Object data) {
		return new Message<Object>(true, data);
	}
}
