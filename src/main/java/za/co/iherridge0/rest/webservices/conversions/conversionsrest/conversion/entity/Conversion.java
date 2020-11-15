package za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.entity;

import com.fasterxml.jackson.annotation.JsonFilter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonFilter("ConversionFilter")
@ApiModel(description = "This API Model describes the Conversion model.")
public class Conversion {

	@ApiModelProperty(notes = "FORMULA: 1 Kelvin equals 273.15 Celcius")
	private double kelvin;
	
	@ApiModelProperty(notes = "FORMULA: 1 Celcius equals -273.15 Kelvin ")
	private double celcius;
	
	@ApiModelProperty(notes = "FORMULA: 1 Mile equals 1.609 Kilometre")
	private double miles;
	
	@ApiModelProperty(notes = "FORMULA: 1 Kilometre equals 1.609 Miles")
	private double km;
	
	protected Conversion() {
		
	}
	
	public Conversion(double value, String conversionType) {
		super();
		if(conversionType.equals(ConversionType.KTOC)) {
			this.kelvin = value;
			if(value==0)
				this.celcius = -273.15;
			else
				this.celcius = kelvin - 273.15;
		} else if(conversionType.equals(ConversionType.CTOK)) {
			this.celcius = value;
			if(value==0)
				this.kelvin = 273.15;
			else
				this.kelvin = celcius + 273.15;
		} else if(conversionType.equals(ConversionType.MTOK)) {
			this.miles = value;
			if(value==0)
				this.km = 1.609;
			else
				this.km = miles + 1.609;
		}
	}

	public double getKelvin() {
		return kelvin;
	}

	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}

	public double getCelcius() {
		return celcius;
	}

	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	
	
}
