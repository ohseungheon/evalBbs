package com.green.evalBbs.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvalBbsDto {

	int bno;

	String title;
	String content; 
	String writer;
	Date regdate;
}
