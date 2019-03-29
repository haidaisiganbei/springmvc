package web.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import web.example.entity.User;

@Controller
public class HomeController {

    /**
     * 映射到home.jsp页面
     *
     * @return
     */
    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }


    /**
     * 接受查询参数
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(@RequestParam("name") String name) {
        return "name:" + name;
    }

    /**
     * 接受路径参数
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/test/{name}")
    @ResponseBody
    public String test1(@PathVariable("name") String name) {
        return "name:" + name;
    }


    @RequestMapping(value = "/test/form", method = RequestMethod.POST)
    @ResponseBody
    public String addForm(User user) {
        return user.toString();
    }
}
