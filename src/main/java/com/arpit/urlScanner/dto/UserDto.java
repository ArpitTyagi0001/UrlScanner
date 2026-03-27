package com.arpit.urlScanner.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private String name;
    private String url;
    private Date age;
    private String email;
    private String phno;
}
