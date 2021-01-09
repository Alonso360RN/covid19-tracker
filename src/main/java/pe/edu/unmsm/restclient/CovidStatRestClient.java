package pe.edu.unmsm.restclient;

import java.util.Map;

import pe.edu.unmsm.dto.CovidStatDTO;

public interface CovidStatRestClient {

	public CovidStatDTO listCovidStatsByCountry(Map<String, Object> request);
}
