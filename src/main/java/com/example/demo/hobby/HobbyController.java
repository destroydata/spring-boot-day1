package com.example.demo.hobby;

import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hobbies")
@RequiredArgsConstructor
public class HobbyController {


    private final HobbyService hobbyService;

    @PostMapping
    public void insertHobby(@RequestParam String name, @RequestParam Integer memberId) {

        hobbyService.insertHobby(name, memberId);
    }
}
