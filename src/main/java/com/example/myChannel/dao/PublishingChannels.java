package com.example.myChannel.dao;

import com.example.myChannel.model.Recording;

import java.time.ZonedDateTime;

public interface PublishingChannels {
    void publish(Recording recording, ZonedDateTime publishAvailableDate);
}
