package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@Controller
 *  +
 * @ResponseBody 把类中的所有的响应数据转换为json数据
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    //注入service层
    //规定该注入不是必须的,可以为空
    /*@Autowired(required = false)*/
    @Reference(timeout = 10000)
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<Brand> findAl(){
        return brandService.findAll();
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Brand brand){
        try {
            brandService.save(brand);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @PostMapping("/update")
    public boolean update(@RequestBody Brand brand){
        try {
            brandService.update(brand);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
