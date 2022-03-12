package com.spring.scheduling.scheduler

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.concurrent.atomic.AtomicInteger

@Component
class Counter {
    private val count = AtomicInteger(0)

    @Scheduled(fixedDelay = 5)
    fun scheduled() {
        count.incrementAndGet()
    }

    val invocationCount: Int
        get() = count.get()
}