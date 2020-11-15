package za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.entity.Conversion;
import za.co.iherridge0.rest.webservices.conversions.conversionsrest.conversion.service.ConversionDaoService;

@RestController
public class ConversionResource {
	
	@Autowired
	ConversionDaoService conversionDaoService;
	
	@PostMapping("conversions/ktoc")
	public Conversion convertK2C(@RequestBody double kelvin) {
		return conversionDaoService.convertK2C(kelvin);
	}

	@PostMapping("conversions/ctok")
	public Conversion convertC2K(@RequestBody double celcius) {
		return conversionDaoService.convertC2K(celcius);
	}
}
