package com.mkdata.hrms;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringBootTest(classes = Application.class)
@SpringJUnitConfig
class HrmsErpApplicationTests {

    @Test
    void testConfigure() {
        String[] args = {""};
        Runnable runnable = () -> HrmsErpApplication.main(args);
        assertNotNull(runnable);
    }
}
