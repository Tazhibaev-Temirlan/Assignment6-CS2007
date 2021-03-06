package kz.aitu.oop.assignment6;

public class RoadLogistics implements Logistics{

	@Override
	public Transport planDelivery() {
		// TODO Auto-generated method stub
		return new Truck();
	}

	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Truck();
	}
}
