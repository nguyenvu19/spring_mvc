package edu.fa.repository;

import edu.fa.model.May;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MayRepository  extends JpaRepository<May, Integer> {
}
