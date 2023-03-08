package tech.iboot.ffmpeg;

import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;

import java.io.IOException;

/**
 * <strong></strong>
 * <p></p>
 * Created on 2023/3/8
 *
 * @author Hong Luo
 **/
public class TestFFmpeg {
    public static void main(String[] args) throws IOException {
        FFprobe ffprobe = new FFprobe();
        FFmpegProbeResult probeResult = ffprobe.probe("G:\\wma\\v7\\1.mp4");
        FFmpegFormat format = probeResult.getFormat();
        System.out.format("%nFile: '%s' ; Format: '%s' ; Duration: %.3fs",
                format.filename,
                format.format_long_name,
                format.duration
        );


    }
}
