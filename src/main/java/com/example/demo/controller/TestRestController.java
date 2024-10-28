package com.example.demo.controller;

import com.example.demo.service.TestItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/v1/*")
@RestController
public class TestRestController {

    private TestItemService testService;

    public TestRestController(TestItemService testService) {
        this.testService = testService;
    }

   
    /**
     * 사번(user id) 조회
     *
     * @return
     */
    @GetMapping("/user")
    public ResponseEntity<?> gerUserId() throws Exception {
        return ResponseEntity.ok(testService.gerUserId());
    }

 
}
