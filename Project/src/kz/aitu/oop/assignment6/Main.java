package kz.aitu.oop.assignment6;

public class Main {
	public static void main(String[] args) {
		Logistics logistic=createLogisticsByTransport("Train");
		Transport t1=logistic.planDelivery();
		Logistics a=createLogisticsByTransport("Ship");
		Transport t2=a.createTransport();
		
		t1.deliver();
		t2.deliver();
	}
	public static Logistics createLogisticsByTransport(String transport) {
		if (transport.equalsIgnoreCase("Train")) {
			return new RailroadLogistics();
		} else if (transport.equalsIgnoreCase("Truck")) {
			return new RoadLogistics();
		} else if (transport.equalsIgnoreCase("Ship")) {
			return new SeaLogistics();
		} else {
			throw new RuntimeException(transport+"is unknown transport");
		}
	}
}