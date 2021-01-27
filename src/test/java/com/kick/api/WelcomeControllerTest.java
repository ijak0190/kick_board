package com.kick.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kick.api.vo.BoardVo;

@ExtendWith(SpringExtension.class) 
@SpringBootTest 
@AutoConfigureMockMvc
class WelcomeControllerTest {
	@Autowired 
	private MockMvc mockMvc;
	
	
	private static ObjectMapper objectMapper = new ObjectMapper(); 
	
	final BoardVo boardVo = BoardVo.builder().brdIdx(0).brdSbj("°«´ëÈñ").build(); 
	 
//	@BeforeEach 
//	public void setup() throws Exception { 
//		String param = objectMapper.writeValueAsString(boardVo);
//		this.mockMvc.perform(post("/boardList").contentType(MediaType.APPLICATION_JSON).content(param)) .andExpect(status().isOk()).andDo(print()); 
//	} 
	@Test 
	public void testGetUsers() throws Exception { 
		// when 
		// then 
		this.mockMvc.perform(get("/boardList").contentType(MediaType.APPLICATION_JSON)) .andExpect(status().isOk()).andDo(print()); 
	}
}

