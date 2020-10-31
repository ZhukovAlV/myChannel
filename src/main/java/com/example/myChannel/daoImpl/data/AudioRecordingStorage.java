package com.example.myChannel.daoImpl.data;

import com.example.myChannel.dao.DataStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AudioRecordingStorage implements DataStorage {

    private final static Logger LOGGER = LoggerFactory.getLogger(AudioRecordingStorage.class);

    @Override
    public String save(String path) {
        LOGGER.info("Save Audio recording to path {}", path);
        return path;
    }
}
