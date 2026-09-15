package com.dgsw.ex05.hello;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.Object;
import java.util.Map;

@RestController
public class HelloController {
    // 상품명과 상품의 갯수를 받는 api 를 get 방식으로 만들어보세요
    // api/product
    // @Operation, @Parameter, @RequestParam, @GetMapping 사용하세요
    @GetMapping("api/producct")
    @Operation(summary = "상품명과 갯수를 반환", description = "작성")
    public Map<String, Object> product(
            @Parameter(description = "상품명과 갯수를 보내세요", example = "우성, 10개")
            @RequestParam(defaultValue = "없음") String pName,
            @RequestParam(defaultValue = "0개") String pCount
    ) {
        System.out.println(pName + " " + pCount);
        return Map.of("message", "Hello World");
    }


    @GetMapping("api/hello")
    @Operation(summary = "이름을 보내면 인사함", description = "실명 작성")
    public Map<String, Object> hello(
            @Parameter(description = "이름 보내세요", example = "홍길동")
            @RequestParam(defaultValue = "익명") String name
    ) {
        System.out.println("hello" + name);
        return Map.of("message", "Hello World");
    }
}