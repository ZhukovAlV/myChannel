package com.example.myChannel.service;

import com.example.myChannel.daoImpl.promotion.PromotionDaoimpl;
import com.example.myChannel.model.Recording;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class PromotionService {

    com.example.myChannel.dao.PromotionService promotion = new PromotionDaoimpl();

    public void createCampaign(Recording recording, ZonedDateTime campaignCreateDate){
        promotion.createCampaign(recording,campaignCreateDate);
    };
}
