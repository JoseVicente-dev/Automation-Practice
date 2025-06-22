package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Request implements Serializable {

	@JsonProperty("name")
	private String name;

	@JsonProperty("job")
	private String job;
}