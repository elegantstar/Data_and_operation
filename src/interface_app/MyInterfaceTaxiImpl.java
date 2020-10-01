package interface_app;

import inheritance.Car;

public class MyInterfaceTaxiImpl extends Car implements MyInterfaceTaxi, MyInterfaceCar {

	/**
	 * interface를 implements 하려면 반드시 interface의 methods를 구현해야만 한다.
	 * 
	 * interface의 장점
	 * 1. 기능을 구현하기 전에 스펙에 대해서 미리 정의할 수 있다. (계획을 미리 짠다)
	 * 2. 다중 상속이 가능하다. (interface 두 개 이상을 implement 할 수 있다)
	 */
		
	private int basicRate; //기본요금
	private boolean isEmpty = true;
	private String company;
	private int numOfPassengers; //탑승객 수
	private int rate; //요금
	private int revenue = 0; // 수익
	private int distance = 0; // 이동거리
	private int ratePerDistance;
	
	private void calculateRate() {
		rate += distance * ratePerDistance;
	}
	
	@Override
	public void pickUp(int numOfPassengers, int distance) {
		if(numOfPassengers > 0) {
			this.numOfPassengers = numOfPassengers;
			isEmpty = false;
			rate = basicRate;
			this.distance = distance;
		}
	}
	
	@Override
	public void dropOff() {
		if(!isEmpty) {
			calculateRate();
			numOfPassengers = 0;
			isEmpty = true;
			revenue += rate;
			rate = basicRate;
		
		}
	}

	public int getBasicRate() {
		return basicRate;
	}

	public void setBasicRate(int basicRate) {
		this.basicRate = basicRate;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getRatePerDistance() {
		return ratePerDistance;
	}

	public void setRatePerDistance(int ratePerDistance) {
		this.ratePerDistance = ratePerDistance;
	}
	
	
	
}
