package com.example.myChannel.dao;

import com.example.myChannel.model.Recording;

import java.time.ZonedDateTime;

public interface PromotionService {
    void createCampaign(Recording recording, ZonedDateTime campaignCreateDate);

}
