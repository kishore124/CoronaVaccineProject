package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronaVaccineRepo;

@Service("service")
public class CoronaVaccineServiceImpl implements ICoronaVaccineService {

	@Autowired
	private ICoronaVaccineRepo dao;

	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		CoronaVaccine vaccineId = null;
		System.out.println(dao.getClass().getName());
		if (vaccine != null) {
			vaccineId = dao.save(vaccine);
		}

		return vaccineId != null ? "vaccine registration successful with id:: " + vaccineId.getVaccineId()
				: "vaccine registration unsuccessful";
	}

	@Override
	public Iterable<CoronaVaccine> registerVaccineInBatch(Iterable<CoronaVaccine> vaccines) {
		if (vaccines != null)
			return dao.saveAll(vaccines);
		else
			throw new IllegalArgumentException("batch insertion not done..");
	}

	@Override
	public Optional<CoronaVaccine> getVaccineDetialsById(Long id) {

		Optional<CoronaVaccine> optionalProduct = dao.findById(id);
		if (optionalProduct.isPresent()) {
			return optionalProduct;
		} else {
			throw new IllegalArgumentException("Record Not found");
		}

	}

	@Override
	public Boolean vaccineExits(Long id) {
		return dao.existsById(id);

	}

	@Override
	public Iterable<CoronaVaccine> getAllVaccineDetials() {
		return dao.findAll();

	}

	@Override
	public Iterable<CoronaVaccine> getAllVaccineDetialsBydIds(List<Long> ids) {
		return dao.findAllById(ids);
	}

	@Override
	public String updateVaccineDetails(CoronaVaccine vaccine) {
		CoronaVaccine vaccineId = null;
		if (vaccine != null) {
			vaccineId = dao.save(vaccine);
		}
		return vaccineId != null ? "updation successful with id" + vaccineId.getVaccineId() : "updation unsuccessful";
	}

	@Override
	public String deleteById(Long id) {
		Optional<CoronaVaccine> details = dao.findById(id);
		if (details.isPresent()) {
			dao.deleteById(id);
			return "deletion successful";
		} else {
			return "deletion unsuccessful no details found for the given id:: " + id;
		}
	}

	@Override
	public String deleteByObject(CoronaVaccine vaccine) {
		Optional<CoronaVaccine> details = dao.findById(vaccine.getVaccineId());
		if (details.isPresent()) {
			dao.delete(vaccine);
			return "deletion successful";

		} else {
			return "deletion UNsuccessful";

		}
	}

	@Override
	public String deleteAllbyId(List<Long> ids) {
		List<CoronaVaccine> details = (List<CoronaVaccine>) dao.findAllById(ids);
		if (ids.size() == details.size()) {

			dao.deleteAllById(ids);
			return "deletion successful";

		} else
			return "deletion UNsuccessful";

	}

}