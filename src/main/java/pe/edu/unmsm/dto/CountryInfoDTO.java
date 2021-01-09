package pe.edu.unmsm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryInfoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("_id")
	private Long id;
	
	@JsonProperty("iso2")
	private String iso2;
	
	@JsonProperty("iso3")
	private String iso3;
	
	@JsonProperty("lat")
	private Long lat;
	
	@JsonProperty("long")
	private Long longitude;
	
	@JsonProperty("flag")
	private String flag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIso2() {
		return iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public Long getLat() {
		return lat;
	}

	public void setLat(Long lat) {
		this.lat = lat;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
}
