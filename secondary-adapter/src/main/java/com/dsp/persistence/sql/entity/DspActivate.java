package com.dsp.persistence.sql.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "dsp_activate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DspActivate {
    @Id
    private String dspId;


    private String dspName;


    private String strategyId;

    private String strategyName;
}
