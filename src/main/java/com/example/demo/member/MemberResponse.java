package com.example.demo.member;

import com.example.demo.hobby.Hobby;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MemberResponse {
    private Integer id;
    private String name;
    private Integer age;
    private List<HobbyDto> hobbies = new ArrayList<>();
    public MemberResponse(Member member){
        this.id = member.getId();
        this.age = member.getAge();
        this.name = member.getName();
//        List<Hobby> hobbies = member.getHobbies();
//        for (int i = 0; i < hobbies.size(); i++) {
//            HobbyDto hobby = new HobbyDto(hobbies.get(i).getId()
//                    , hobbies.get(i).getName());
//            this.hobbies.add(hobby);
//        }
        this.hobbies = member.getHobbies()
                .stream()
                .map(m -> new HobbyDto(m.getId(), m.getName()))
                .toList();

    }
    @Getter @AllArgsConstructor
    class HobbyDto{
        private Integer id;
        private String name;
    }
}
