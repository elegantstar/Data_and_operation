package interface_app;

import inheritance.Car;

public class MyInterfaceTaxiImpl extends Car implements MyInterfaceTaxi, MyInterfaceCar {

	/**
	 * interface�� implements �Ϸ��� �ݵ�� interface�� methods�� �����ؾ߸� �Ѵ�.
	 * 
	 * interface�� ����
	 * 1. ����� �����ϱ� ���� ���忡 ���ؼ� �̸� ������ �� �ִ�. (��ȹ�� �̸� §��)
	 * 2. ���� ����� �����ϴ�. (interface �� �� �̻��� implement �� �� �ִ�)
	 */
		
	private int basicRate; //�⺻���
	private boolean isEmpty = true;
	private String company;
	private int numOfPassengers; //ž�°� ��
	private int rate; //���
	private int revenue = 0; // ����
	private int distance = 0; // �̵��Ÿ�
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
