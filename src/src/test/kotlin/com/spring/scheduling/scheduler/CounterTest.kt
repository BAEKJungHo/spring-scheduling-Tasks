package com.spring.scheduling.scheduler

import io.kotlintest.specs.BehaviorSpec
import org.awaitility.Awaitility
import org.junit.jupiter.api.Assertions.*
import org.mockito.Mockito
import org.mockito.Mockito.atLeast
import org.mockito.Mockito.verify
import java.util.concurrent.TimeUnit

internal class CounterTest: BehaviorSpec({

    val counter = Mockito.spy(Counter())

    given("counter") {
        `when`("when") {
            then("then") {
                Awaitility.await()
                    .atMost(1, TimeUnit.SECONDS)
                    .untilAsserted { verify(counter, atLeast(5)).scheduled() }
            }
        }
    }
})