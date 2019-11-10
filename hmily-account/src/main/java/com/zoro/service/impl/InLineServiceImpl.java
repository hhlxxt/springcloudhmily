package com.zoro.service.impl;

import com.zoro.service.InLineService;
import org.dromara.hmily.annotation.Hmily;
import org.springframework.stereotype.Component;

/**
 * The type In line service.
 *
 * (Myth)
 */
@Component
public class InLineServiceImpl implements InLineService {

    @Override
    @Hmily(confirmMethod = "confirm", cancelMethod = "cancel")
    public void test() {
        System.out.println("执行inline try......");
    }

    /**
     * Confrim.
     */
    public void confirm() {
        System.out.println("执行inline confirm......");
    }

    /**
     * Cancel.
     */
    public void cancel() {
        System.out.println("执行inline cancel......");
    }
}
