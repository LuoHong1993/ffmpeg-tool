package tech.iboot.ffmpeg.service;

import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;

/**
 * <strong></strong>
 * <p></p>
 * Created on 2023/3/9
 *
 * @author Hong Luo
 **/
public interface FFprobeService {
    /**
     * 根据链接获取视频信息
     * @param url
     * @return
     */
    FFmpegProbeResult getVideoInfo(String url);
}
