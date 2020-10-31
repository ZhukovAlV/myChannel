package com.example.myChannel.service;


import com.example.myChannel.dao.DataStorage;
import com.example.myChannel.daoImpl.data.AudioRecordingStorage;
import com.example.myChannel.daoImpl.data.VideoStorage;
import com.example.myChannel.model.Recording;
import com.example.myChannel.model.TypeTrack;
import org.springframework.stereotype.Service;


@Service
public class RecordingDataHub {

    DataStorage data;

    public String save(Recording recording) {
        if (recording.getTypeTrack().equals(TypeTrack.VIDEO)) {
            data = new VideoStorage();
        } else if (recording.getTypeTrack().equals(TypeTrack.AUDIO)) {
            data = new AudioRecordingStorage();
        } else return null;
        return data.save(recording.getUrlFile().toString());
    }
}
