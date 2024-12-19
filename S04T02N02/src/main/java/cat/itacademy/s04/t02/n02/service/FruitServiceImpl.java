package cat.itacademy.s04.t02.n02.service;

import cat.itacademy.s04.t02.n02.exception.FruitAlreadyExistsException;
import cat.itacademy.s04.t02.n02.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n02.model.Fruit;
import cat.itacademy.s04.t02.n02.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    FruitRepository fruitRepository;

    @Override
    public List<Fruit> findAllFruits() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit saveFruit(Fruit fruit) throws FruitAlreadyExistsException {
        if (fruitRepository.existsByName(fruit.getName())) throw new FruitAlreadyExistsException("Fruit name already exists in the ddbb");
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Integer id, Fruit fruit) throws FruitNotFoundException {
        Fruit fruitDb =  getFruitById(id);
        if(Objects.nonNull(fruit.getName()) && !"".equalsIgnoreCase(fruit.getName())) {
            fruitDb.setName(fruit.getName());
        }
        fruitDb.setQuantity(fruit.getQuantity());

        return fruitRepository.save(fruitDb);
    }

    @Override
    public void deleteFruit(Integer id) throws FruitNotFoundException {
        getFruitById(id);
        fruitRepository.deleteById(id);
    }

    @Override
    public Fruit getFruitById(Integer id) throws FruitNotFoundException {
        return fruitRepository.findById(id) .orElseThrow(() -> new FruitNotFoundException("Fruit does not exist for id"));
    }
}

