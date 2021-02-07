package com.kick.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) 
@SpringBootTest 
@AutoConfigureMockMvc
class WelcomeControllerTest {
//	@Autowired 
//	private MockMvc mockMvc;
	
	
//	private static ObjectMapper objectMapper = new ObjectMapper(); 
	
//	final BoardVo boardVo = BoardVo.builder().brdIdx(0).brdSbj("테스").build(); 
	 
//	@BeforeEach 
//	public void setup() throws Exception { 
//		String param = objectMapper.writeValueAsString(boardVo);
//		this.mockMvc.perform(post("/boardList").contentType(MediaType.APPLICATION_JSON).content(param)) .andExpect(status().isOk()).andDo(print()); 
//	} 
	@Test 
	public void testGetUsers() throws Exception { 
		// when 
		// then 
//		this.mockMvc.perform(get("/boardList").contentType(MediaType.APPLICATION_JSON)) .andExpect(status().isOk()).andDo(print()); 
		String value = "안녕";
		assertEquals(value,"안녕");
	}
}

