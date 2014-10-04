package pattern.behavioral.memento;

public class SalesProspect {
	private String name;
	private String phone;
	private double budget;

	
	public SalesProspect() {
	}
	public SalesProspect(String name, String phone, double budget) {
		this.name = name;
		this.phone = phone;
		this.budget = budget;
	}
	public String getName() {
		return name;
	}
	public Memento saveMemento(){
		System.out.println("\nSaving state --\n");
		return new Memento(this.name, this.phone, this.budget);
	}
	 public void restoreMemento(Memento memento){
		 System.out.println("\nRestoring state --\n");

		 this.setName(memento.getName());
		 this.setPhone(memento.getPhone()); 
		 this.setBudget(memento.getBudget()); 
	 }
	public void setName(String name) {
		this.name = name;
		System.out.printf("Name:  %s\n",this.name);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		System.out.printf("Phone:  %s\n",this.phone);
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
		System.out.printf("Budjet:  %s\n",this.budget);
	}
}
