package in.ineuron.bo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CoronaVaccine implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vaccineId;
	private String name;
	private String companyName;
	private String country;
	private Float price;
	private Integer noOFDoses;

	@Transient
	private LocalDate createdDate;

	public CoronaVaccine() {
	}

	public CoronaVaccine(Long vaccineId, String name, String companyName, String country, Float price,
			Integer noOFDoses) {
		this.vaccineId = vaccineId;
		this.name = name;
		this.companyName = companyName;
		this.country = country;
		this.price = price;
		this.noOFDoses = noOFDoses;
	}

	public Long getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(Long vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getNoOFDoses() {
		return noOFDoses;
	}

	public void setNoOFDoses(Integer noOFDoses) {
		this.noOFDoses = noOFDoses;
	}

	@Override
	public String toString() {
		return "CoronaVaccine [vaccineId=" + vaccineId + ", name=" + name + ", companyName=" + companyName
				+ ", country=" + country + ", price=" + price + ", noOFDoses=" + noOFDoses + "]";
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

}