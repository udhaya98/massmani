package com.manidon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/name")
public class Controller {
@GetMapping("value")
public String getMethodName() {
    return "Mani The King";
}

}
