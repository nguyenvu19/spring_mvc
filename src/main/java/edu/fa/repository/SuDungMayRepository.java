package edu.fa.repository;

import edu.fa.model.SuDungMay;
import edu.fa.model.SuDungMayId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuDungMayRepository extends JpaRepository<SuDungMay, SuDungMayId> {
}
