package com.spring.scheduling.scheduler

import io.kotlintest.specs.BehaviorSpec
import io.mockk.spyk
import org.awaitility.Awaitility.await
import org.mockito.Mockito.atLeast
import org.mockito.Mockito.spy
import org.mockito.Mockito.verify
import java.util.concurrent.TimeUnit

internal class TimeSchedulerTest: BehaviorSpec({

    val timeScheduler = spy(TimeScheduler())

    given("timeScheduler") {
        `when`("when") {
            then("then") {
                await()
                    .atMost(10, TimeUnit.SECONDS)
//                    .untilAsserted(() -> verify(timeScheduler, atLeast(2)).reportCurrentTime())
            }
        }
    }

//    @Test
//    fun timeScheduler() {
//        await()
//            .atMost(10, TimeUnit.SECONDS)
//            .untilAsserted { verify(timeScheduler, atLeast(5)).reportCurrentTime() }
//    }
})
