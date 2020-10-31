package com.example.myChannel.daoImpl.promotion;

import com.example.myChannel.dao.PromotionService;
import com.example.myChannel.model.Recording;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class PromotionDaoimpl implements PromotionService {

    private final static Logger LOGGER = LoggerFactory.getLogger(PromotionDaoimpl.class);

    @Override
    public void createCampaign(Recording recording, ZonedDateTime campaignCreateDate) {
        LOGGER.info("Сreate Campaign, recording {}, campaignCreateDate {}", recording, campaignCreateDate);
    }
}
