package com.bitrekz.bolsta.repo;

import com.bitrekz.bolsta.model.Locality;
import com.bitrekz.bolsta.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocalityRepo extends JpaRepository<Locality, Long> {
    List<Locality> findAllByRegion(Region region);
}
