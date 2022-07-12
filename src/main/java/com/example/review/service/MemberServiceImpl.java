package com.example.review.service;

import java.util.ArrayList;

import com.example.review.entity.Member;

public class MemberServiceImpl implements MemberService{

  @Override
  public String greet(int i) {
    String[] gteetings = {"Good Morning", "Hello", "Good Evenig"};
    return gteetings[i];
    
  }

  @Override
  public ArrayList<Member> getAll() {
    ArrayList<Member> list = new ArrayList<>();
    Member mem1 = new Member(1, "Linda", "linda@example.com");
    Member mem2 = new Member(2, "James", "James@example.com");
    list.add(mem1);
    list.add(mem2);

    return list;
  }
  
}
