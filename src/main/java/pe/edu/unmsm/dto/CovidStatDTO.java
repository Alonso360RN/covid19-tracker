package pe.edu.unmsm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CovidStatDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("updated")
	private Long updated;

	@JsonProperty("country")
	private String country;

	@JsonProperty("countryInfo")
	private CountryInfoDTO countryInfo;

	@JsonProperty("cases")
	private Long cases;

	@JsonProperty("todayCases")
	private Long todayCases;

	@JsonProperty("deaths")
	private Long deaths;

	@JsonProperty("todayDeaths")
	private Long todayDeaths;

	@JsonProperty("recovered")
	private Long recovered;

	@JsonProperty("todayRecovered")
	private Long todayRecovered;

	@JsonProperty("active")
	private Long active;

	@JsonProperty("critical")
	private Long critical;

	@JsonProperty("casesPerOneMillion")
	private Long casesPerOneMillion;

	@JsonProperty("deathsPerOneMillion")
	private Long deathsPerOneMillion;

	@JsonProperty("tests")
	private Long tests;

	@JsonProperty("population")
	private Long population;

	@JsonProperty("continent")
	private String continent;

	@JsonProperty("oneCasePerPeople")
	private Long oneCasePerPeople;

	@JsonProperty("oneDeathPerPeople")
	private Long oneDeathPerPeople;

	@JsonProperty("oneTestPerPeople")
	private Long oneTestPerPeople;

	@JsonProperty("activePerOneMillion")
	private Double activePerOneMillion;

	@JsonProperty("recoveredPerOneMillion")
	private Double recoveredPerOneMillion;

	@JsonProperty("criticalPerOneMillion")
	private Double criticalPerOneMillion;

	public Long getUpdated() {
		return updated;
	}

	public void setUpdated(Long updated) {
		this.updated = updated;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public CountryInfoDTO getCountryInfo() {
		return countryInfo;
	}

	public void setCountryInfo(CountryInfoDTO countryInfo) {
		this.countryInfo = countryInfo;
	}

	public Long getCases() {
		return cases;
	}

	public void setCases(Long cases) {
		this.cases = cases;
	}

	public Long getTodayCases() {
		return todayCases;
	}

	public void setTodayCases(Long todayCases) {
		this.todayCases = todayCases;
	}

	public Long getDeaths() {
		return deaths;
	}

	public void setDeaths(Long deaths) {
		this.deaths = deaths;
	}

	public Long getTodayDeaths() {
		return todayDeaths;
	}

	public void setTodayDeaths(Long todayDeaths) {
		this.todayDeaths = todayDeaths;
	}

	public Long getRecovered() {
		return recovered;
	}

	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}

	public Long getTodayRecovered() {
		return todayRecovered;
	}

	public void setTodayRecovered(Long todayRecovered) {
		this.todayRecovered = todayRecovered;
	}

	public Long getActive() {
		return active;
	}

	public void setActive(Long active) {
		this.active = active;
	}

	public Long getCritical() {
		return critical;
	}

	public void setCritical(Long critical) {
		this.critical = critical;
	}

	public Long getCasesPerOneMillion() {
		return casesPerOneMillion;
	}

	public void setCasesPerOneMillion(Long casesPerOneMillion) {
		this.casesPerOneMillion = casesPerOneMillion;
	}

	public Long getDeathsPerOneMillion() {
		return deathsPerOneMillion;
	}

	public void setDeathsPerOneMillion(Long deathsPerOneMillion) {
		this.deathsPerOneMillion = deathsPerOneMillion;
	}

	public Long getTests() {
		return tests;
	}

	public void setTests(Long tests) {
		this.tests = tests;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Long getOneCasePerPeople() {
		return oneCasePerPeople;
	}

	public void setOneCasePerPeople(Long oneCasePerPeople) {
		this.oneCasePerPeople = oneCasePerPeople;
	}

	public Long getOneDeathPerPeople() {
		return oneDeathPerPeople;
	}

	public void setOneDeathPerPeople(Long oneDeathPerPeople) {
		this.oneDeathPerPeople = oneDeathPerPeople;
	}

	public Long getOneTestPerPeople() {
		return oneTestPerPeople;
	}

	public void setOneTestPerPeople(Long oneTestPerPeople) {
		this.oneTestPerPeople = oneTestPerPeople;
	}

	public Double getActivePerOneMillion() {
		return activePerOneMillion;
	}

	public void setActivePerOneMillion(Double activePerOneMillion) {
		this.activePerOneMillion = activePerOneMillion;
	}

	public Double getRecoveredPerOneMillion() {
		return recoveredPerOneMillion;
	}

	public void setRecoveredPerOneMillion(Double recoveredPerOneMillion) {
		this.recoveredPerOneMillion = recoveredPerOneMillion;
	}

	public Double getCriticalPerOneMillion() {
		return criticalPerOneMillion;
	}

	public void setCriticalPerOneMillion(Double criticalPerOneMillion) {
		this.criticalPerOneMillion = criticalPerOneMillion;
	}

}
