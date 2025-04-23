package com.example.yontaku.form;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizForm {
	/** 識別ID */
	private Integer quiz_id;
	/** クイズの内容 */
	@NotBlank(message = "問題文は必須です")
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
	/** 「登録」or「変更」判定用 */
	private Boolean newQuiz;
}
