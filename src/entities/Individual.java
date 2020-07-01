package entities;

public class Individual extends TaxPayer {

	private Double heatlthExpenditures;

	public Individual(String name, Double anuallncome, Double heatlthExpenditures) {
		super(name, anuallncome);
		this.heatlthExpenditures = heatlthExpenditures;
	}

	public Double getHeatlthExpenditures() {
		return heatlthExpenditures;
	}

	public void setHeatlthExpenditures(Double heatlthExpenditures) {
		this.heatlthExpenditures = heatlthExpenditures;
	}

	@Override
	public Double tax() {

		if (getAnuallncome() < 20000.0) {

			return getAnuallncome() * 0.15 - heatlthExpenditures * 0.5;
		}

		else {
			return getAnuallncome() * 0.25 - heatlthExpenditures * 0.5;
		}

	}

}
