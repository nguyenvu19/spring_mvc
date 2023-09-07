package edu.fa.service;

import edu.fa.model.DichVu;

import java.util.Optional;

public interface DichVuService {
    Iterable<DichVu> getAllDichVus();
    DichVu addDichVu(DichVu dichVu);
    DichVu updateDichVu(DichVu dichVu);
    void deleteDichVu(int maDV);
    Optional<DichVu> getDichVuById(int maDV);
}
