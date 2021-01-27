package com.kick.api.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardVo {
	private long brdIdx;
	private String brdSbj;
	private String brdRegId;
	private String brdRegName;
	private String brdRegDate;
	private String brdContent;
	private long brdHitCnt;
} 
