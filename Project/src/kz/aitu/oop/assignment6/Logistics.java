package kz.aitu.oop.assignment6;

public interface Logistics {
	public default Transport planDelivery() {
		Transport t =createTransport();
		return t;
	};
	public Transport createTransport();
}