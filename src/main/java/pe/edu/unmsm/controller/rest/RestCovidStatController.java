package pe.edu.unmsm.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unmsm.model.CovidStatModel;
import pe.edu.unmsm.service.CovidStatService;

@RestController
@RequestMapping(value = "/api")
public class RestCovidStatController {

	@Autowired
	private CovidStatService covidStatService;

	@GetMapping(value = "/countries/{country-id}")
	public CovidStatModel listCovidStatsByCountry(@PathVariable(name = "country-id") String countryCode) {
		CovidStatModel covidStatModelRequest = new CovidStatModel();
		covidStatModelRequest.setCountryCode(countryCode);

		return this.covidStatService.listCovidStatsByCountry(covidStatModelRequest);
	}
}
