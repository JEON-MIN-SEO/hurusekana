package com.huruse.kana.Controller;

import com.huruse.kana.Util.Root;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping("/v2")
@ResponseBody
public class ImageController {
    @GetMapping("root")
    public Root test(){

        Root root = new Root();

        root.setRoot("http://54.180.163.7:8080/display/detection.jpg");

        return root;
    }

}
