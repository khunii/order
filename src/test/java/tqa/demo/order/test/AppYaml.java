package tqa.demo.order.test;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppYaml {
	@JsonIgnore
	Spring spring;
	Framework framework; 

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Spring {
		String profile;
	}
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Framework {
		Domain domain;
		@JsonProperty("apim-consumer")
		ApimConsumer apimConsumer;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Services {
		String name;
		String url;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Domain {
		List<Services> services;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ApimConsumer {
		@JsonProperty("endpoint-url")
		String endpointUrl;
	}

}
