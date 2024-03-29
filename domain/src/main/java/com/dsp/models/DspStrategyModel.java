package com.dsp.models;

import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
public class DspStrategyModel {
    private String dspId;
    private String dspName;
    private String strategyId;
    private String strategyName;
}
