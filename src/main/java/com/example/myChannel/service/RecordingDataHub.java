package com.example.myChannel.service;


import com.example.myChannel.dao.DataStorage;
import com.example.myChannel.daoImpl.data.AudioRecordingStorage;
import com.example.myChannel.daoImpl.data.VideoStorage;
import com.example.myChannel.model.Recording;
import com.example.myChannel.model.TypeTrack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class RecordingDataHub {

    private final static Logger LOGGER = LoggerFactory.getLogger(RecordingDataHub.class);
    DataStorage data;

    public String save(Recording recording) {
        if (recording.getTypeTrack().equals(TypeTrack.VIDEO)) {
            data = new VideoStorage();
        } else if (recording.getTypeTrack().equals(TypeTrack.AUDIO)) {
            data = new AudioRecordingStorage();
        } else return null;
        LOGGER.info("Recording {}", recording);
        return data.save(recording.getUrlFile().toString());
    }
}
