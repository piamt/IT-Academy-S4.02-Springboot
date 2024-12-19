package cat.itacademy.s04.t02.n01.service;

import cat.itacademy.s04.t02.n01.exception.FruitAlreadyExistsException;
import cat.itacademy.s04.t02.n01.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruit;

import java.util.List;

public interface FruitService {

    List<Fruit> findAllFruits();
    Fruit saveFruit(Fruit fruit) throws FruitAlreadyExistsException;
    Fruit updateFruit(Integer id, Fruit fruit) throws FruitNotFoundException;
    void deleteFruit(Integer id) throws FruitNotFoundException;
    Fruit getFruitById(Integer id) throws FruitNotFoundException;
}
