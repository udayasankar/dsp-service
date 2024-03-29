package com.dsp.mapper;

import com.dsp.models.DspStrategyModel;
import com.dsp.persistence.sql.entity.DspActivate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DspSegmentActivateMapper {
    @Mapping(source = "dspStrategyModel.dspId", target = "dspId")
    @Mapping(source = "dspStrategyModel.dspName", target = "dspName")
    @Mapping(source = "dspStrategyModel.strategyId", target = "strategyId")
    @Mapping(source = "dspStrategyModel.strategyName", target = "strategyName")
    DspActivate map(DspStrategyModel dspStrategyModel);

    @Mapping(source = "dspActivate.dspId", target = "dspId")
    @Mapping(source = "dspActivate.dspName", target = "dspName")
    @Mapping(source = "dspActivate.strategyId", target = "strategyId")
    @Mapping(source = "dspActivate.strategyName", target = "strategyName")
    DspStrategyModel map(DspActivate dspActivate);

}
