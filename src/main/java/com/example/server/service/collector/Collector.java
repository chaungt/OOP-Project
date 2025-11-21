package com.example.server.service.collector;

import com.example.server.model.SocialPostEntity;
import java.time.LocalDate;
import java.util.List;

public interface Collector {
    List<SocialPostEntity> collect(String disasterName, String keyword, LocalDate startDate, LocalDate endDate);
}