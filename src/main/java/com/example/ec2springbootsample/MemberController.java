package com.example.ec2springbootsample;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
  private final MemberRepository memberRepository;

  public MemberController(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  @GetMapping("/members")
  public List<Member> getMembers() {
    return this.memberRepository.findAll();
  }
}
