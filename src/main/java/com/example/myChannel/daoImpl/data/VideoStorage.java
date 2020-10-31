package com.example.myChannel.daoImpl.data;

import com.example.myChannel.dao.DataStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VideoStorage implements DataStorage {

    private final static Logger LOGGER = LoggerFactory.getLogger(VideoStorage.class);

    @Override
    public String save(String path) {
        LOGGER.info("Save video recording to path {}", path);
        return path;
    }
}
