package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.service.CoronaVaccineServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		SpringApplication.run(DaoSpringDataJpa01Application.class, args);

		/*
		 *
		 * 
		 * List<CoronaVaccine> vaccines = new ArrayList<CoronaVaccine>();
		 * vaccines.add(new CoronaVaccine(null, "sputnik", "russie", "russia", 900.6f,
		 * 2)); vaccines.add(new CoronaVaccine(null, "modana", "modane", "USA", 1800.6f,
		 * 2)); vaccines.add(new CoronaVaccine(null, "pyzer", "pizer", "USA", 900.6f,
		 * 2));
		 * 
		 * Iterable<CoronaVaccine> res = service.registerVaccineInBatch(vaccines);
		 * 
		 * res.forEach(vaccine -> System.out.println(vaccine.getVaccineId()));
		 * 
		 * 
		 * Iterable<CoronaVaccine> vaccinesList = service.getAllVaccineDetials();
		 * 
		 * vaccinesList.forEach(System.out::println);
		 * 
		 * 
		 * try { Optional<CoronaVaccine> details = service.getVaccineDetialsById(1L);
		 * 
		 * System.out.println(details); }catch(IllegalArgumentException e) {
		 * System.out.println(e.getMessage()); }
		 * 
		 * 
		 * CoronaVaccine vaccine=new
		 * CoronaVaccine(3l,"sputnik","Russ","RUSSIA",1500.6f,3);
		 * System.out.println(service.updateVaccineDetails(vaccine));
		 * 
		 * 
		 * 
		 * System.out.println(service.deleteById(3l));
		 * 
		 * System.out.println(service.deleteByObject(new
		 * CoronaVaccine(4l,null,null,null,null,null)));
		 * 
		 * List<Long> ids=new ArrayList<Long>(); ids.add(5l); ids.add(6l); ids.add(7l);
		 * System.out.println(service.deleteAllbyId(ids));
		 * 
		 * 
		 * 
		 * System.out.println(service.vaccineExits(1l));
		 * 
		 * List<Long> ids=new ArrayList<Long>(); ids.add(1L); ids.add(2L); ids.add(3L);
		 * ids.add(9L); Iterable<CoronaVaccine> resList =
		 * service.getAllVaccineDetialsBydIds(ids);
		 * 
		 * resList.forEach(System.out::println); factory.close();
		 */
	}
}