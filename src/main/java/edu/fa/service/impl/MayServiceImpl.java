package edu.fa.service.impl;

import edu.fa.model.May;
import edu.fa.repository.MayRepository;
import edu.fa.service.MayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MayServiceImpl implements MayService {
    @Autowired
    private MayRepository mayRepository;

    @Override
    public Iterable<May> getAllMays() {
        return mayRepository.findAll();
    }

    @Override
    public May addMay(May may) {
        return mayRepository.save(may);
    }

    @Override
    public May updateMay(May may) {
        return mayRepository.save(may);
    }

    @Override
    public void deleteMay(int maMay) {
        mayRepository.deleteById(maMay);
    }

    @Override
    public Optional<May> getMayById(int maMay) {
        return mayRepository.findById(maMay);
    }
}
