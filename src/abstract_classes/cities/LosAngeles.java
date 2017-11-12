package abstract_classes.cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population*growthRate;
		double it = growthRate/2;
		taxes*=it;
		return taxes;
	}

}
