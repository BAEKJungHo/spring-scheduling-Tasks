package com.spring.scheduling.scheduler

import lombok.extern.slf4j.Slf4j
import com.spring.scheduling.logger.logger
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Slf4j
@Component
class TimeScheduler {

    private val log = logger()
    private var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    var callCount = 0

    /** 5초 마다 현재 시간을 로그로 찍는 스케줄러 */
    @Scheduled(fixedRate = 5000)
    fun reportCurrentTime() {
        log.info("The time is now {}", LocalDateTime.now().format(formatter))
        callCount++
    }
}