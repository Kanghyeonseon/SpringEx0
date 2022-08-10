package com.korea.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor // ����Ʈ������
@AllArgsConstructor // ��� ��� ���� ������
@Component
public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private String updateDate;
}
