package com.mijie.gulimall.member.feign;

import com.mijie.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CounponFeignService
 * @Description TOO
 * @Author PC
 * @Date 2022/6/23  18:07
 * @Version 1.0
 **/
@FeignClient("gulimall-coupon")
public interface CounponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
