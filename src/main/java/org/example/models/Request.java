package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Request implements Serializable {

	@JsonProperty("name")
	private String name;

	@JsonProperty("job")
	private String job;

	public Request(String name, String job) {
		this.name=name;
		this.job=job;
	}
}