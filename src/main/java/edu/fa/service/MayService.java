package edu.fa.service;

import edu.fa.model.May;

import java.util.Optional;

public interface MayService {
    Iterable<May> getAllMays();
    May addMay(May may);
    May updateMay(May may);
    void deleteMay(int maMay);
    Optional<May> getMayById(int maMay);
}
