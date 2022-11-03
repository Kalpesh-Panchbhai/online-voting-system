package com.pratiksha.onlinevotingsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Sample {
    @GetMapping("/user")
    List<String> all() {
        List<String> strings = new ArrayList<>();
        strings.add("Pratiksha");
        strings.add("Kalpesh");
        strings.add("Jenny");
        return strings;
    }
}
