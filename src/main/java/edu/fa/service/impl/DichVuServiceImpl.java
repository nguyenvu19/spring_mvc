package edu.fa.service.impl;

import edu.fa.model.DichVu;
import edu.fa.repository.DichVuRepository;
import edu.fa.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    private DichVuRepository dichVuRepository;
    @Override
    public Iterable<DichVu> getAllDichVus() {
        return dichVuRepository.findAll();
    }

    @Override
    public DichVu addDichVu(DichVu dichVu) {
        return dichVuRepository.save(dichVu);
    }

    @Override
    public DichVu updateDichVu(DichVu dichVu) {
        return dichVuRepository.save(dichVu);
    }

    @Override
    public void deleteDichVu(int maDV) {
        dichVuRepository.deleteById(maDV);
    }

    @Override
    public Optional<DichVu> getDichVuById(int maDV) {
        return dichVuRepository.findById(maDV);
    }
}
