package com.kick.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kick.api.boader.BoardService;
import com.kick.api.vo.BoardVo;


@RestController
public class WelcomeController {
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome test";
	}
	
	@RequestMapping("/boardList")
	public @ResponseBody List<BoardVo> boardList() {
		BoardVo bo = BoardVo.builder().build();
		
		return boardService.selectBoard(bo);
	}
}
