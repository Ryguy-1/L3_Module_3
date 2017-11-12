package abstract_classes.cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population*growthRate+1000000;
		return taxes;
	}
}
