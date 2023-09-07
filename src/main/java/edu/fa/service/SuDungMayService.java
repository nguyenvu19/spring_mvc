package edu.fa.service;

import edu.fa.model.SuDungMay;

public interface SuDungMayService {
    Iterable<SuDungMay> getAllSuDungMays();
    void addSuDungMay(SuDungMay suDungMay);
}
