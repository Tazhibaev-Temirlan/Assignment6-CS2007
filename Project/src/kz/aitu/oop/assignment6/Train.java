package kz.aitu.oop.assignment6;

public class Train implements Transport{

	@Override
	public void deliver() {
		System.out.println("Deliver by railroad in a container");
	}
}
