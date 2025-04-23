package com.example.yontaku.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
	/** クイズ識別ID */
	private Integer quiz_id;
	/** クイズの内容 */
	private String question;
	/** 選択肢① */
	private String option1;
	/** 選択肢② */
	private String option2;
	/** 選択肢③ */
	private String option3;
	/** 選択肢④ */
	private String option4;
	/** クイズの解答 */
	private Integer answer;
	/** 作成者 */
	private String author_name;
	/** クイズのジャンル */
	private String genre;
	/** 解説 */
	private String description;
}
