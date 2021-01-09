package pe.edu.unmsm.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unmsm.dto.CovidStatDTO;
import pe.edu.unmsm.model.CovidStatModel;
import pe.edu.unmsm.restclient.CovidStatRestClient;
import pe.edu.unmsm.service.CovidStatService;
import pe.edu.unmsm.shared.RestClientConstants;

@Service
public class CovidStatServiceImpl implements CovidStatService {

	private static final String PARAMETER_COUNTRY_ID = "country-id";

	@Autowired
	private CovidStatRestClient covidStatRestClient;

	@Override
	public CovidStatModel listCovidStatsByCountry(CovidStatModel covidStatModelRequest) {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put(PARAMETER_COUNTRY_ID, covidStatModelRequest.getCountryCode());

		Map<String, Object> request = new HashMap<>();
		request.put(RestClientConstants.PARAMETERS, parameters);

		CovidStatDTO covidStatDTO = this.covidStatRestClient.listCovidStatsByCountry(request);

		CovidStatModel covidStatModelResponse = new CovidStatModel();
		covidStatModelResponse.setActive(covidStatDTO.getActive());
		covidStatModelResponse.setCases(covidStatDTO.getCases());
		covidStatModelResponse.setCountry(covidStatDTO.getCountry());
		covidStatModelResponse.setDeaths(covidStatDTO.getDeaths());
		covidStatModelResponse.setRecovered(covidStatDTO.getRecovered());
		covidStatModelResponse.setLastUpdated(covidStatDTO.getUpdated());

		return covidStatModelResponse;
	}

}
