package com.dsp.handler;


import com.dsp.aggregates.DspStrategy;
import com.dsp.command.DspCommand;
import com.dsp.mapper.DspStrategyMapper;
import com.dsp.mapper.DspStrategyModelMapper;
import com.dsp.service.DspSegmentCreationService;
import com.dsp.models.DspStrategyModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DspHandlerImpl implements DspHandler{

    private final DspSegmentCreationService dspSegmentCreationService;
    private final DspStrategyModelMapper dspStrategyModelMapper;
    private final DspStrategyMapper dspStrategyMapper;

    @Override
    public DspStrategy getDspInfo(String dspId) {
        DspStrategy dspStrategy = dspStrategyMapper.map(dspSegmentCreationService.getDspSegmentInfo(dspId));
        return dspStrategy;
    }

    @Override
    public DspStrategy activateDspSegment(DspCommand dspCommand) {
        DspStrategyModel dspStrategyModel = dspStrategyModelMapper.map(dspCommand);
        DspStrategyModel strategyModel = dspSegmentCreationService.dspSegmentCreate(dspStrategyModel);
        return dspStrategyMapper.map(strategyModel);
    }
}
