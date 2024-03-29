package com.dsp.service;


import com.dsp.models.DspStrategyModel;

public interface DspSegmentCreationService {
    public DspStrategyModel dspSegmentCreate(DspStrategyModel dspStrategy);
    public DspStrategyModel getDspSegmentInfo(String campaignId);
}
