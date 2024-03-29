package com.dsp.mapper;


import com.dsp.command.DspCommand;
import com.dsp.model.DspRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DspMapper {
    DspCommand map(DspRequest dspRequest);

}
