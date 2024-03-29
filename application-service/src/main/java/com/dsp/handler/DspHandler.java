package com.dsp.handler;


import com.dsp.aggregates.DspStrategy;
import com.dsp.command.DspCommand;

public interface DspHandler {
    public DspStrategy getDspInfo(String dspId);
    public DspStrategy activateDspSegment(DspCommand dspCommand);
}
