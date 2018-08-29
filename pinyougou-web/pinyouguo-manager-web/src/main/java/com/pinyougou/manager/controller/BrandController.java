package com.pinyougou.manager.controller;

import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**@Controller
 *  +
 * @ResponseBody 把类中的所有的响应数据转换为json数据
 */
@RestController
public class BrandController {
    //注入service层
    //规定该注入不是必须的,可以为空
    @Autowired(required = false)
    private BrandService brandService;

    @GetMapping("/brand/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }
}
