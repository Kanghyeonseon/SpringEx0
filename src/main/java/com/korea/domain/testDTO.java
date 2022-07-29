package com.korea.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // ����Ʈ������
@AllArgsConstructor // ��� ��� ���� ������
@Builder
@Component
public class testDTO {
	private String name;
	private String age;
	private String addr;
}
