package in.ineuron;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronaVaccineRepo;
import in.ineuron.service.CoronaVaccineServiceImpl;

@SpringBootTest
class CoronaVaccineServiceImplTest {

	@Mock
	private ICoronaVaccineRepo dao;

	@InjectMocks
	private CoronaVaccineServiceImpl service;

	@Test
	public void registerVaccineTest() {

		CoronaVaccine vaccine = new CoronaVaccine(1L, "Shield", "Zenco", "IND", 522.05f, 2);

		Mockito.when(dao.save(vaccine)).thenReturn(vaccine);

		String res = service.registerVaccine(vaccine);

		assertNotNull(res);
	}

}
