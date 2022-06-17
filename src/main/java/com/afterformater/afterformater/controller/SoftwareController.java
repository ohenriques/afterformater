package com.afterformater.afterformater.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoftwareController {

        @GetMapping("/software")
        @ResponseBody
        public String getSoftware() {
                return "Software controller";
        }
}
