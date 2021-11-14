package _05_arraysLoops.hw4;
import static __myLib.Rand.randInt;

class AdditionalMethods {
	////////////////////////////////////////////////////////////////////////////
	static Car[] CarsInit(int n){
		Car[] cars = new Car[n];
		char[] codes = {'B', 'C', 'D', 'W', 'V', 'L', 'R', 'S', 'F', 'T', 'J', 'P'};
		for(int i = 0; i < cars.length;++i)
			cars[i] = new Car(codes[randInt(codes.length - 1)],
					randInt(1888, 2021), (randInt(10, 40) * 100));
		return cars;
	}
	////////////////////////////////////////////////////////////////////////////
	static void sortCarsByProductionYear(Car[] cars){
		Car tmp;
		boolean isSorted;
		for(int i = 0, j = i, minYearIndx = i,
				k = cars.length - 1, l = k, maxYearIndx = k;
				i < k; j = ++i, minYearIndx = i, l = --k, maxYearIndx = k)
		{
			isSorted = true;
			while(++j <= k)
				if(cars[j].getProductionYear() < cars[minYearIndx].getProductionYear()) {
					minYearIndx = j;
					if(isSorted) isSorted = false;
				}
			if(isSorted) break;
			if(minYearIndx != i){
				tmp = cars[i];
				cars[i] = cars[minYearIndx];
				cars[minYearIndx] = tmp;
			}
			while(--l > i)
				if(cars[l].getProductionYear() > cars[maxYearIndx].getProductionYear()) {
					maxYearIndx = l;
					if(isSorted) isSorted = false;
				}
			if(isSorted) break;
			if(maxYearIndx != k){
				tmp = cars[k];
				cars[k] = cars[maxYearIndx];
				cars[maxYearIndx] = tmp;
			}
		}
	}
	////////////////////////////////////////////////////////////////////////////
	static void printCars(Car[] cars) {
		for(Car car: cars)
			System.out.println(car);
	}
	////////////////////////////////////////////////////////////////////////////
	public static void printCars(Car[] cars, int year, String requiredData) {
		if(requiredData.equals("year"))
		for(Car car: cars)
			if(car.getProductionYear() == year)	
			System.out.println(car);
	}
}