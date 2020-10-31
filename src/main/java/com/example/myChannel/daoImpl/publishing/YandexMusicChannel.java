package com.example.myChannel.daoImpl.publishing;

import com.example.myChannel.dao.PublishingChannels;
import com.example.myChannel.model.Recording;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;

public class YandexMusicChannel  implements PublishingChannels {

    private final static Logger LOGGER = LoggerFactory.getLogger(YandexMusicChannel.class);

    @Override
    public void publish(Recording recording, ZonedDateTime publishAvailableDate) {
        LOGGER.info("Publish recording {} on Yandex Music {}", recording, publishAvailableDate);
    }
}
