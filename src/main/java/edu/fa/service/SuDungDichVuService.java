package edu.fa.service;

import edu.fa.model.SuDungDichVu;

public interface SuDungDichVuService {
    Iterable<SuDungDichVu> getAllSuDungDichVus();
    void addSuDungDichVu(SuDungDichVu suDungDichVu);
}
