package kz.aitu.oop.assignment6;

public class RailroadLogistics implements Logistics{

	@Override
	public Transport planDelivery() {
		// TODO Auto-generated method stub
		return new Train();
	}

	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Train();
	}
}
