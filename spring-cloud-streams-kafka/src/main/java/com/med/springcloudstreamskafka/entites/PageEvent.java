package com.med.springcloudstreamskafka.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}
