package in.ineuron.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.exception.ProvideProperDetails;
import in.ineuron.exception.VaccineDataValiationException;
import in.ineuron.service.CoronaVaccineServiceImpl;
import in.ineuron.validator.VaccineValidator;

@RestController
@RequestMapping("/api/vaccine")
public class VaccineRestController {

	@Autowired
	private VaccineValidator validator;

	@Autowired
	private CoronaVaccineServiceImpl service;

	@GetMapping("/getdetails/{id}")
	public ResponseEntity<CoronaVaccine> getVaccineData(@PathVariable Long id) {

		if (id != null) {
			Optional<CoronaVaccine> result = service.getVaccineDetialsById(id);

			return new ResponseEntity<CoronaVaccine>(result.get(), HttpStatus.OK);
		} else {
			throw new ProvideProperDetails("Provide valid id");
		}
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveVaccinceData(@RequestBody CoronaVaccine vaccine) {

		if (validator.validateVaccineDetails(vaccine)) {

			String res = service.registerVaccine(vaccine);
			return new ResponseEntity<String>(res, HttpStatus.OK);
		} else {
			throw new VaccineDataValiationException("Please provide the vaccine details in proper manner");
		}

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteVaccinceData(@PathVariable Long id) {

		if (id != null) {
			String result = service.deleteById(id);

			return new ResponseEntity<String>(result, HttpStatus.OK);
		} else {
			throw new ProvideProperDetails("Provide valid id");
		}
	}
}