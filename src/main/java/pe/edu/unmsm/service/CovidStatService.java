package pe.edu.unmsm.service;

import pe.edu.unmsm.model.CovidStatModel;

public interface CovidStatService {

	public CovidStatModel listCovidStatsByCountry(CovidStatModel covidStatModelRequest);
}
