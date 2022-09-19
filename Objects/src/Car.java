
public class Car {
	String color;
	String make;
	String model;
	String bodyType;
	int year;
	
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
	
	/*
	steer(double turnDegrees)
	2. accelerate(double inputForce)
	3. break(double inputForce)
	4. start()
	*/
}
