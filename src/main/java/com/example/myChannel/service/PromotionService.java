package com.example.myChannel.service;

import com.example.myChannel.dao.DataStorage;
import com.example.myChannel.dao.PublishingChannels;
import com.example.myChannel.daoImpl.data.AudioRecordingStorage;
import com.example.myChannel.daoImpl.data.VideoStorage;
import com.example.myChannel.daoImpl.promotion.PromotionDaoimpl;
import com.example.myChannel.daoImpl.publishing.ItunesChannel;
import com.example.myChannel.daoImpl.publishing.YandexMusicChannel;
import com.example.myChannel.daoImpl.publishing.YoutubeMusicChannel;
import com.example.myChannel.model.Recording;
import com.example.myChannel.model.TypeTrack;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class PromotionService {

    com.example.myChannel.dao.PromotionService promotion = new PromotionDaoimpl();

    public void createCampaign(Recording recording, ZonedDateTime campaignCreateDate){
        promotion.createCampaign(recording,campaignCreateDate);
    };

    public void publish(Recording recording, ZonedDateTime publishAvailableDate){
        if (recording.getTypeTrack().equals(TypeTrack.VIDEO)) {
            publishChannel(new YoutubeMusicChannel(), recording, publishAvailableDate);
        }
        if (recording.getTypeTrack().equals(TypeTrack.AUDIO)) {
            publishChannel(new YandexMusicChannel(), recording, publishAvailableDate);
            publishChannel(new ItunesChannel(), recording, publishAvailableDate);
        }
    }

    void publishChannel (PublishingChannels publishingChannels, Recording recording, ZonedDateTime publishAvailableDate){
        publishingChannels.publish(recording, publishAvailableDate);
    }

}
