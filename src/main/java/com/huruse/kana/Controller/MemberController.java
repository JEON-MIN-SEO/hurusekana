package com.huruse.kana.Controller;

import com.huruse.kana.entity.MemberEntity;
import com.huruse.kana.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/v1")
public class MemberController {
    private final MemberRepository memberRepository;

    @GetMapping("member")
    public List<MemberEntity> findAllMember() {
        return memberRepository.findAll();
    }
}
