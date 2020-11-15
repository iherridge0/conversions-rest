package za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.service;

import org.springframework.stereotype.Component;

import za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.entity.Conversion;
import za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.entity.ConversionType;

@Component
public class ConversionDaoService {
	
	public Conversion convertK2C(double kelvin) {
		return new Conversion(kelvin, ConversionType.KTOC);
	}
	
	public Conversion convertC2K(double celcius) {
		return new Conversion(celcius, ConversionType.CTOK);
	}

	public Conversion convertM2K(double miles) {
		return new Conversion(miles, ConversionType.MTOK);
	}

	public Conversion convertK2M(double km) {
		return new Conversion(km, ConversionType.KTOM);
	}
}
