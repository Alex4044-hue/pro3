package dk.via.pro3.springbootgrpcserverexample.service;

import dk.via.pro3.springbootgrpcserverexample.model.VinylRecord;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class VinylService
{
  private final Map<String, VinylRecord> vinylMap= new ConcurrentHashMap<>();

  public VinylRecord addVinyl(String name)
  {

    var id=
    }
  }
