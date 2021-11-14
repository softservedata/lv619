package _08_nestedInnerClasses.pt1;
import java.time.LocalDate;

final class Car {
	////////////////////////////////////////////////////////////////////////////
	static class CarBuilder{
		////////////////////////////////////////////////////////////////////////
		private Car car;
		////////////////////////////////////////////////////////////////////////
		CarBuilder() {car = new Car();}
		////////////////////////////////////////////////////////////////////////
		Car getCar() {return car;}
		////////////////////////////////////////////////////////////////////////
		CarBuilder addModel(String model) {
			car.model = model;
			return this;
			}
		CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
			car.dateOfProduction = dateOfProduction;
			return this;
		}
		CarBuilder addEngineCapacity(double engineCapacity) {
			car.engineCapacity = Math.round(engineCapacity * 100) / 100d;
			return this;
		}
		CarBuilder addColor(String color) {
			car.color = color;
			return this;
		}
		CarBuilder addPassengerCapacity(int passengerCapacity) {
			car.passengerCapacity = passengerCapacity;
			return this;
		}
		CarBuilder setIsAirConditioning(boolean isAirConditioning) {
			car.isAirConditioning = isAirConditioning;
			return this;
		}
		////////////////////////////////////////////////////////////////////////
	}
	////////////////////////////////////////////////////////////////////////////
	private String model;
	private LocalDate dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passengerCapacity;
	private Boolean isAirConditioning = null;
	////////////////////////////////////////////////////////////////////////////
	private Car(){}
	////////////////////////////////////////////////////////////////////////////
	static CarBuilder getCar() {
		return new CarBuilder();
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return (model == null ? "" : "model:          \t" + model + '\n') + 
				(dateOfProduction == null ? "" : "dateOfProduction: \t" + dateOfProduction + '\n') +
				(engineCapacity == 0 ? "" : "engineCapacity: \t" + engineCapacity + '\n') +
				(color == null ? "" : "color:          \t" + color + '\n') +
				(passengerCapacity == 0 ? "" : "passengerCapacity: \t" + passengerCapacity + '\n') + 
				(isAirConditioning == null ? "" : (isAirConditioning == false ? "don't " : "") + "have air conditioning");
	}
	////////////////////////////////////////////////////////////////////////////
}