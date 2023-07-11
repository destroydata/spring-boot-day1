package com.example.demo.member;

import com.example.demo.hobby.Hobby;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MemberResponse {
    private Integer id;
    private String name;
    private Integer age;
    private List<Hobby> hobbies = new ArrayList<>();
    public MemberResponse(Member member){
        this.id = member.getId();
        this.age = member.getAge();
        this.name = member.getName();
        List<Hobby> hobbies = member.getHobbies();
        for (int i = 0; i < hobbies.size(); i++) {
            Hobby hobby = new Hobby(hobbies.get(i).getId()
                    , hobbies.get(i).getName()
                    , null);
            this.hobbies.add(hobby);
        }

    }

}
