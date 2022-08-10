package com.korea.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor // 디폴트생성자
@AllArgsConstructor // 모든 멤버 포함 생성자
@Component
public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private String updateDate;
}
