package kz.aitu.oop.assignment6;

public class SeaLogistics implements Logistics{

	@Override
	public Transport planDelivery() {
		// TODO Auto-generated method stub
		return new Ship();
	}

	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Ship();
	}
}
