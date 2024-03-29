package com.dsp.persistence.sql.repository;

import com.dsp.persistence.sql.entity.DspActivate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DspActivateRepository extends JpaRepository<DspActivate, String> {
    public DspActivate findByDspId(String dspId);

}
