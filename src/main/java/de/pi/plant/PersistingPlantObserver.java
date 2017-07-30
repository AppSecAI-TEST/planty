package de.pi.plant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Marcaroni on 21.07.2017.
 */
@Component
public class PersistingPlantObserver implements PlantObserver{

  @Autowired
  PlantAPI plantAPI;

  @PostConstruct
  private void register() {
    plantAPI.addPlantObserver(this);
  }

  @Override
  public void updatePlants(List<Plant> plants) {

  }
}
