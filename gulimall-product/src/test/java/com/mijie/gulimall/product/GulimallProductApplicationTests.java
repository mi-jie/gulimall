package com.mijie.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mijie.gulimall.product.entity.BrandEntity;
import com.mijie.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class GulimallProductApplicationTests {

    //@Resource
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        /*插入*/
        /*BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功... ...");*/

        /*修改*/
        /*BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(13l);
        brandEntity.setDescript("华为手机");
        brandService.updateById(brandEntity);*/

        /*查询*/
        List<BrandEntity> list = brandService.list();
        list.forEach(System.out::println);
        System.out.println("完成");
        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 12l));
        brandEntityList.forEach(System.out::println);
    }

}
