package com.didispace.chapter11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("测试 assert")
public class AssetTest {
    @Test
    @DisplayName("测试断言 assertTrue")
    void testTrue() {
        assertTrue(1 > 2);
    }

    @Test
    @DisplayName("测试断言 assertEquals")
    void testEquals() {
        assertEquals(1, 2);
    }

    @Test
    @DisplayName("测试断言 assertNotNull")
    void testNotNull() {
        assertNotNull(new Object());
    }

    @Test
    @DisplayName("测试断言 assertTimeout")
    void testTimeout() {
        String result = (String) assertTimeout(ofSeconds(2),() -> {
            Thread.sleep(1000);
            return "未超时";
        });
        System.out.println(result);
    }

    /**
     * assertAll 组合断言，当内部所有断言都正确执行才算通过
     */
    @Test
    @DisplayName("测试组合断言")
    void testTAll() {
        assertAll("测试组合断言",
                () -> {
                    assertTrue(1 < 2, "断言1");
                },
                () -> {
                    assertNotNull(new Object(), "断言2");
                },
                () -> {
                    assertEquals(1,1);
                }
        );
    }

    /**
     * RepeatedTest 重复测试
     */
    @RepeatedTest(3)
    @DisplayName("重复测试")
    void testRepeat() {
        System.out.println("重复测试");
    }

    /**
     * ParameterizedTest 参数化测试
     */
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 5, 100 })
    @DisplayName("参数化测试")
    void testParam(int param) {
        assertEquals(param, Math.abs(param));
        System.out.println(param);
    }
}
