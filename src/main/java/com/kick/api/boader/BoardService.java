package com.kick.api.boader;

import java.util.List;

import com.kick.api.vo.BoardVo;


public interface BoardService {

	List<BoardVo> selectBoard(BoardVo bo);

}
