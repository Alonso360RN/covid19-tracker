package pe.edu.unmsm.restclient.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pe.edu.unmsm.dto.CovidStatDTO;
import pe.edu.unmsm.restclient.CovidStatRestClient;
import pe.edu.unmsm.shared.RestClientConstants;

@Service
public class CovidStatRestClientImpl implements CovidStatRestClient {
	
	private static final String PATH = "/v3/covid-19/countries/{country-id}";

	@Value("${api.covid19.host}")
	private String host;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CovidStatDTO listCovidStatsByCountry(Map<String, Object> request) {
		Map<String, Object> parameters = (Map<String, Object>) request.get(RestClientConstants.PARAMETERS);
		
		return restTemplate.getForObject(host + PATH, CovidStatDTO.class, parameters);
	}
}