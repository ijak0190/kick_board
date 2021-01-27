package com.kick.api.boader;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kick.api.vo.BoardVo;


@Mapper
public interface BoardDao {

	List<BoardVo> selectBoard(BoardVo bo);

}
