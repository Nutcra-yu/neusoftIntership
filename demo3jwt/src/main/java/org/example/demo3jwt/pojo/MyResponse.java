package org.example.demo3jwt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyResponse {
    private String data;
    private String token;
}
