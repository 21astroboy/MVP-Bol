package com.bitrekz.bolsta.repo;

import com.bitrekz.bolsta.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepo extends JpaRepository<Region, Long> {
    Region findByName(String name);
}
