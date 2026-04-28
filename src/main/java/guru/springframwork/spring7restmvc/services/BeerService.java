package guru.springframwork.spring7restmvc.services;

import guru.springframwork.spring7restmvc.model.Beer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeers();

    Optional<Beer> getBeerById(UUID id);

    Optional<Beer> saveNewBeer(Beer beer);

    void updateBeerById(UUID id, Beer beer);

    void deleteById(UUID id);

    void patchBeerById(UUID beerId, Beer beer);
}
