package com.dsp.storage;

import com.dsp.infra.persistance.DspSegmentActivation;
import com.dsp.mapper.DspSegmentActivateMapper;
import com.dsp.models.DspStrategyModel;
import com.dsp.persistence.sql.repository.DspActivateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DspSegmentActivationimpl implements DspSegmentActivation {

    private final DspActivateRepository dspActivateRepository;
    private final DspSegmentActivateMapper dspSegmentActivateMapper;

    @Override
    public DspStrategyModel saveDspSegmentActivation(DspStrategyModel dspStrategyModel) {
        dspActivateRepository.save(dspSegmentActivateMapper.map(dspStrategyModel));
        return dspStrategyModel;
    }

    @Override
    public DspStrategyModel getDspSegmentInfo(String dspId) {
        return dspSegmentActivateMapper.map(dspActivateRepository.findByDspId(dspId));
    }
}
