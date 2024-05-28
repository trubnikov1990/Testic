package test.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {

  @GetMapping
  public String test() {
    return "test".toUpperCase();
  }

  @GetMapping("/test2")
  public String test2() {
    return "test2".toLowerCase();
  }
}
