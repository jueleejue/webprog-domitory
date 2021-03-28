package com.kit.domitory.member;

import java.util.HashMap;
import java.util.Map;

public class FileMemberStorage implements MemberStorage{

    // 메모리 상에 올려놓기만 할것임
    private static Map<Long,Member> members = new HashMap<>();


    @Override
    public void store(Member member) {
        System.out.println("==========to File Storage==========");
        members.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        System.out.println("==========from File Storage==========");
        return members.get(memberId);
    }
}
