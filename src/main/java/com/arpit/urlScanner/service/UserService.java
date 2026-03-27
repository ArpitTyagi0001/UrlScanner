package com.arpit.urlScanner.service;

import com.arpit.urlScanner.dto.UserDto;
import com.arpit.urlScanner.entity.User;
import com.arpit.urlScanner.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UserDto addUrl(UserDto userDto) {
        User user = modelMapper.map(userDto , User.class);

        User user1 = userRepository.findByUrl(user.getUrl());

        if(user1!=null){
            System.out.println("This url is already exits : " + user.getUrl());
            throw new IllegalArgumentException("This url is already exists :"+ user.getUrl());
        }

        User user2 = userRepository.save(user);
        return modelMapper.map(user2 , UserDto.class);
    }
}
