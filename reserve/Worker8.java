package reserve;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker8 {

	private String name;
	private WorkerLevel8 level;
	private Double baseSalary;
	
	private Department8 department;
	private List<HourContract8> contracts = new ArrayList<>();
	
	public Worker8() {
		
	}

	public Worker8(String name, WorkerLevel8 level, Double baseSalary, Department8 department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel8 getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel8 level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalay(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department8 getDepartment() {
		return department;
	}

	public void setDepartment(Department8 department) {
		this.department = department;
	}

	public List<HourContract8> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract8 contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract8 contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract8 c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
			sum += c.totalValue();
		}
	}
		return sum;
	}
}
