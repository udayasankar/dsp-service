package com.dsp.aggregates;

import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
public class DspStrategy {
    private String dspId;
    private String dspName;
    private String strategyId;
    private String strategyName;
}
