package com.kick.api.boader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kick.api.vo.BoardVo;


@Service
public class BoadServicelmpl implements BoardService{
	@Autowired
	BoardDao boardDao;
	
	@Override
	public List<BoardVo> selectBoard(BoardVo bo) {
		return boardDao.selectBoard(bo);
	}

}
