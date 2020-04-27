package com.omisflicker.img.controller;

import com.omisflicker.img.dto.ApiResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image")
public class ImageController {

    @GetMapping("/search")
    public @ResponseBody
    ApiResponseDTO addContent(@RequestParam(value = "q", required = false) String searchString){
        ApiResponseDTO<String> response = new ApiResponseDTO();
        return response;
    }

}
