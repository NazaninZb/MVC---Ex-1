package model.service;

import model.entity.CarEntity;
import model.repository.CarRepository;

import java.util.List;

public class CarService {
    private static CarService ourInstance = new CarService();

    public static CarService getInstance() {
        return ourInstance;
    }

    private CarService() {
    }


    public void buy(CarEntity carEntity) throws Exception{
        try (CarRepository carRepository = new CarRepository()){
            carEntity.setPrise(carEntity.getPrise()*1000000);
            carEntity.setPrise((long) (carEntity.getPrise() - (0.05 * carEntity.getPrise())));
            carRepository.insert(carEntity);
            carRepository.commit();
        }
    }

    public void sell(int number) throws Exception{
        try (CarRepository carRepository = new CarRepository()){
            carRepository.delete(number);
            carRepository.commit();
        }
    }

    public List<CarEntity> report() throws Exception{
        List<CarEntity> carEntities;
        try (CarRepository carRepository = new CarRepository()){
            carEntities = carRepository.select();
            carRepository.commit();
        }
        return carEntities;
    }



}
