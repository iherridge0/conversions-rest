package za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This API Model describes the Conversion model.")
public class Conversion {

	@ApiModelProperty(notes = "FORMULA: 1 Kelvin equals 1 Kelvin - 273.15 Celcius")
	private double k;
	
	@ApiModelProperty(notes = "FORMULA: 1 Celcius equals 1 Celcius + -273.15 Kelvin ")
	private double c;
	
	protected Conversion() {
		
	}
	
	public Conversion(double value, String conversionType) {
		super();
		if(conversionType.equals(ConversionType.KTOC)) {
			this.k = value;
			if(value==0)
				this.c = -273.15;
			else
				this.c = k - 273.15;
		} else if(conversionType.equals(ConversionType.CTOK)) {
			this.c = value;
			if(value==0)
				this.k = 273.15;
			else
				this.k = c + 273.15;
		}
	}

	public double getK() {
		return k;
	}

	public void setK(double k) {
		this.k = k;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	
}
