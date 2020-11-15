package za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.service;

import org.springframework.stereotype.Component;

import za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.entity.Conversion;
import za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.entity.ConversionType;

@Component
public class ConversionDaoService {
	
	public Conversion convertK2C(double k) {
		return new Conversion(k, ConversionType.KTOC);
	}
	

}
