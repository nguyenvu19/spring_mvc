package edu.fa.service.impl;

import edu.fa.model.SuDungDichVu;
import edu.fa.repository.SuDungDichVuRepository;
import edu.fa.service.SuDungDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuDungDichVuServiceImpl implements SuDungDichVuService {
    @Autowired
    private SuDungDichVuRepository suDungDichVuRepository;

    @Override
    public Iterable<SuDungDichVu> getAllSuDungDichVus() {
        return suDungDichVuRepository.findAll();
    }

    @Override
    public void addSuDungDichVu(SuDungDichVu suDungDichVu) {
        suDungDichVuRepository.save(suDungDichVu);
    }
}
