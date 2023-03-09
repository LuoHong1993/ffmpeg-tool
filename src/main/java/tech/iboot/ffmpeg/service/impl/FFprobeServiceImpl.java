package tech.iboot.ffmpeg.service.impl;

import jakarta.annotation.Resource;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;
import org.springframework.stereotype.Service;
import tech.iboot.ffmpeg.service.FFprobeService;

import java.io.IOException;

/**
 * <strong></strong>
 * <p></p>
 * Created on 2023/3/9
 *
 * @author Hong Luo
 **/
@Service
public class FFprobeServiceImpl implements FFprobeService {
    @Resource
    private FFprobe gloablFFprobe;
    @Override
    public FFmpegProbeResult getVideoInfo(String url) {
        try {
            FFmpegProbeResult probeResult = gloablFFprobe.probe(url);
            return probeResult;
        } catch (Exception e) {
            return null;
        }
    }
}
