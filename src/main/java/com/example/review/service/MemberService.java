package com.example.review.service;

import java.util.ArrayList;

import com.example.review.entity.Member;

public interface MemberService {

  String greet(int i);

  ArrayList<Member> getAll();
  
  int sum(int x, int y);
}
