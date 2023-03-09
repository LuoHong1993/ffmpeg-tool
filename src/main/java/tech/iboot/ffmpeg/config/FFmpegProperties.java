package tech.iboot.ffmpeg.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <strong></strong>
 * <p></p>
 * Created on 2023/3/9
 *
 * @author Hong Luo
 **/
@ConfigurationProperties(FFmpegProperties.PREFIX)
@Configuration
@Getter
@Setter
public class FFmpegProperties {
    public static final String PREFIX = "ffmpeg";
    private Url url = new Url();
    @Getter
    @Setter
    public static class Url {
        private String ffmpeg = "";
        private String ffprobe = "";
    }
}
