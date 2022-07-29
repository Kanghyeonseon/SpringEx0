package com.korea.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 디폴트생성자
@AllArgsConstructor // 모든 멤버 포함 생성자
@Builder
@Component
public class testDTO {
	private String name;
	private String age;
	private String addr;
}
