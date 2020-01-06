package com.example.demo.Web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
@CrossOrigin("*")
@Controller
public class UploadController {
    // 因为uploadPage.jsp 在WEB-INF下，不能直接从浏览器访问，所以要在这里加一个uploadPage跳转，这样就可以通过
    @RequestMapping("/uploadPage.do")
    public String uploadPage() {
        return "files";   //过度跳转页
    }

    @PostMapping("/upload.do") // 等价于 @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String doFile(MultipartFile proUrl, HttpServletRequest request){

        String imgs= request.getServletContext().getRealPath("img");
        File f=new File(imgs);
        if (!f.exists()){
            f.mkdir();
        }
        System.out.println(proUrl);
        int pos=proUrl. getOriginalFilename().lastIndexOf(".");
        String suffix= proUrl.getOriginalFilename().substring(pos);
        if (suffix.equals(".jpg")|| suffix.equals(".png")){

        }
        File target=new File(f+"/"+ proUrl.getOriginalFilename().substring(0,pos)+suffix);
        System.out.println(target);
        try {
            FileUtils.copyInputStreamToFile(proUrl.getInputStream(),target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:uploadPage.do";
    }


}
