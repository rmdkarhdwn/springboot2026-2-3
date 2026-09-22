package com.example.ex06.entiy;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {
    //Member(){}
//    Member(){
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    @Schema(example = "홍길동")
    private String name;
    @Schema(example = "test@gmail.com")
    private String email;
    public void update(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
