package tech.iboot.ffmpeg.config;

import jakarta.annotation.Resource;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFprobe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <strong></strong>
 * <p></p>
 * Created on 2023/3/9
 *
 * @author Hong Luo
 **/
@Configuration()
@AutoConfigureAfter(FFmpegProperties.class)
public class FFmpegConfig {
    private final Logger logger  = LoggerFactory.getLogger(FFmpegConfig.class);
    @Resource
    private FFmpegProperties fFmpegProperties;
    @Bean
    public FFmpeg gloablFFmpeg() {
        logger.info("ffmpegUrl ====== " + fFmpegProperties.getUrl().getFfmpeg());
        FFmpeg fFmpeg = null;
        try {
            if (!"".equals(fFmpegProperties.getUrl().getFfmpeg())) {
                fFmpeg = new FFmpeg(fFmpegProperties.getUrl().getFfmpeg());
            } else {
                fFmpeg = new FFmpeg();
            }
        } catch (Exception ignored) {}
        return fFmpeg;
    }
    @Bean
    public FFprobe gloablFFprobe() {
        logger.info("ffprobeUrl ====== " + fFmpegProperties.getUrl().getFfprobe());
        FFprobe fFprobe = null;
        try {
            if (!"".equals(fFmpegProperties.getUrl().getFfprobe())) {
                fFprobe = new FFprobe(fFmpegProperties.getUrl().getFfprobe());
            } else {
                fFprobe = new FFprobe();
            }
        } catch (Exception ignored) {}
        return fFprobe;
    }
}
