package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineService {

	public String registerVaccine(CoronaVaccine vaccine);
	
	public Iterable<CoronaVaccine> registerVaccineInBatch(Iterable<CoronaVaccine> vaccines);
	
	public Optional<CoronaVaccine>  getVaccineDetialsById(Long id);
	
	public Boolean vaccineExits(Long id);
	
	public Iterable<CoronaVaccine> getAllVaccineDetials();
	
	public Iterable<CoronaVaccine> getAllVaccineDetialsBydIds(List<Long> ids);
	
	public String updateVaccineDetails(CoronaVaccine vaccine);
	
	public String deleteById(Long id);
	
	public String deleteByObject(CoronaVaccine vacccine);
	
	public String deleteAllbyId(List<Long> ids);
}