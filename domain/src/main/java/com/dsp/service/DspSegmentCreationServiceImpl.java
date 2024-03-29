package com.dsp.service;


import com.dsp.infra.persistance.DspSegmentActivation;
import com.dsp.models.DspStrategyModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DspSegmentCreationServiceImpl implements DspSegmentCreationService{

    private final DspSegmentActivation dspSegmentActivationRepository;
    @Override
    public DspStrategyModel dspSegmentCreate(DspStrategyModel dspStrategy) {
        return dspSegmentActivationRepository.saveDspSegmentActivation(dspStrategy);
    }

    @Override
    public DspStrategyModel getDspSegmentInfo(String dspId) {
        return dspSegmentActivationRepository.getDspSegmentInfo(dspId);
    }
}
