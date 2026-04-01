package ex1_abstract;

public class AirPlane extends Transport {
	int airportFee;
	int fuelCharge;

	public AirPlane(String name, int baseFare, int airporFee, int fuelCharge, int airportFee) {
		super(name, baseFare);
		this.airportFee = airportFee;
		this.fuelCharge = fuelCharge;

	}

	@Override
	int calculateFare() {
		return airportFee + fuelCharge;
	}

	// 필드는 생성자를 통해서 초기화

	// 총요금 : 기본요금 + 공항 이용료 + 유류할증비

}
