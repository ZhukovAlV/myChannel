package com.example.myChannel.daoImpl.publishing;

import com.example.myChannel.dao.PublishingChannels;
import com.example.myChannel.model.Recording;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;

public class YoutubeMusicChannel  implements PublishingChannels {

    private final static Logger LOGGER = LoggerFactory.getLogger(YoutubeMusicChannel.class);

    @Override
    public void publish(Recording recording, ZonedDateTime publishAvailableDate) {
        LOGGER.info("Publish recording {} on Youtube Music {}", recording, publishAvailableDate);
    }
}
