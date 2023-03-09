package tech.iboot.ffmpeg.controller;

import jakarta.annotation.Resource;
import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;
import org.springframework.web.bind.annotation.*;
import tech.iboot.ffmpeg.dto.FileUrlDto;
import tech.iboot.ffmpeg.service.FFprobeService;

/**
 * <strong></strong>
 * <p></p>
 * Created on 2023/3/9
 *
 * @author Hong Luo
 **/
@RestController
@RequestMapping("/api/ffmpeg")
public class FFmpegController {
    @Resource
    private FFprobeService fFprobeService;

    @PostMapping("/info")
    FFmpegProbeResult getVideoInfo(@RequestBody FileUrlDto fileUrlDto) {
        return fFprobeService.getVideoInfo(fileUrlDto.getUrl());
    }
}
