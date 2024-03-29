package com.dsp.mapper;

import com.dsp.aggregates.DspStrategy;
import com.dsp.models.DspStrategyModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DspStrategyMapper {
    @Mapping(source = "dspStrategyModel.dspId", target = "dspId")
    @Mapping(source = "dspStrategyModel.dspName", target = "dspName")
    @Mapping(source = "dspStrategyModel.strategyId", target = "strategyId")
    @Mapping(source = "dspStrategyModel.strategyName", target = "strategyName")
    DspStrategy map(DspStrategyModel dspStrategyModel);
}
