package com.dsp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DspRequest {
    private String dspId;
    private String dspName;
    private String strategyId;
    private String strategyName;
}
