package com.dsp.mapper;

import com.dsp.aggregates.DspStrategy;
import com.dsp.model.DspResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DspResponseMapper {
    DspResponse map(DspStrategy dspStrategy);
}
