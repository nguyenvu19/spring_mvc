package edu.fa.service.impl;

import edu.fa.model.SuDungMay;
import edu.fa.repository.SuDungMayRepository;
import edu.fa.service.SuDungMayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuDungMayServiceImpl implements SuDungMayService {
    @Autowired
    private SuDungMayRepository suDungMayRepository;

    @Override
    public Iterable<SuDungMay> getAllSuDungMays() {
        return suDungMayRepository.findAll();
    }

    @Override
    public void addSuDungMay(SuDungMay suDungMay) {
        suDungMayRepository.save(suDungMay);
    }
}
