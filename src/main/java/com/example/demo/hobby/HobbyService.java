package com.example.demo.hobby;

import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import com.example.demo.store.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class HobbyService {
    private final MemberService memberService;
    public void insertHobby(String name, Integer memberId) {
        Member member = memberService.findById(memberId);
        HobbyDto hobbyDto = new HobbyDto(name, memberId);
        Store.hobbies.add(hobbyDto);
        member.getHobbies().add(hobbyDto);
    }
}
