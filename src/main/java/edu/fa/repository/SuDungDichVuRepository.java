package edu.fa.repository;

import edu.fa.model.SuDungDichVu;
import edu.fa.model.SuDungDichVuId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuDungDichVuRepository extends JpaRepository<SuDungDichVu, SuDungDichVuId> {
}
