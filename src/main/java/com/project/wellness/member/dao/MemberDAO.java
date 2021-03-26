package com.project.wellness.member.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.wellness.member.vo.MemberVO;

@Repository
public class MemberDAO {

	@Inject SqlSession sql;
	// 회원가입

	public int join(MemberVO vo) throws Exception {
		int cnt = sql.insert("memberMapper.join", vo);
		return cnt;
	
	}
}
