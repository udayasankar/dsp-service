package com.dsp.infra.persistance;


import com.dsp.models.DspStrategyModel;

public interface DspSegmentActivation {
    public DspStrategyModel saveDspSegmentActivation(DspStrategyModel dspStrategyModel);
    public DspStrategyModel getDspSegmentInfo(String campaignId);
}
