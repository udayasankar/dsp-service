package com.dsp.mapper;

import com.dsp.command.DspCommand;
import com.dsp.models.DspStrategyModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DspStrategyModelMapper {
    DspStrategyModel map(DspCommand dspCommand);

}
