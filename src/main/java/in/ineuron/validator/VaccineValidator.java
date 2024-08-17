package in.ineuron.validator;

import org.springframework.stereotype.Component;

import in.ineuron.bo.CoronaVaccine;

@Component
public class VaccineValidator {

	public boolean validateVaccineDetails(CoronaVaccine vaccine) {

		String cmpName = vaccine.getCompanyName();
		String country = vaccine.getCountry();
		String name = vaccine.getName();
		Integer doses = vaccine.getNoOFDoses();
		Float price = vaccine.getPrice();

		if (cmpName != null && country != null && name != null && doses != null && price != null)
			return true;

		return false;
	}

}
