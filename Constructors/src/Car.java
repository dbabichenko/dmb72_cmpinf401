
public class Car {
	private String color;
	private String make;
	private String model;
	private String bodyType;
	private int year;
	
	
	public Car(String make, String model, String bodyType, int year, String color) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.bodyType = bodyType;
		this.year = year;
		this.carState = 0;
	}
	
	int carState = 0; // the car if off
	double speed = 0;
	
	void start() {
		carState = 1; // the car is idling
	}
	
	void accelearate(double inputForce) {
		if (carState != 0) {
			carState = 2; // the car is accelerating
			// Making things up - car accelerates at twice the input force
			speed += inputForce * 2;
		}
	}
	
	void slowDown(double inputForce) {
		speed -= inputForce * 2;
		if(speed <= 0) {
			carState = 1;
			speed = 0;
		}
	}
	
	void turnOff() {
		carState = 0;
		speed = 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}


	public String getBodyType() {
		return bodyType;
	}


	public int getYear() {
		return year;
	}

	public int getCarState() {
		return carState;
	}



	public double getSpeed() {
		return speed;
	}

	
}
