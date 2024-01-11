package com.liveasy.logistics.liveasy.load;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoadRepository extends JpaRepository<Load, Integer> {
     List<Load> findByshipperId(int shipperId);
}
