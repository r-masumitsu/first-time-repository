package galaxy.app.registration;

import java.io.Serializable;
import java.util.Objects;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegistrationForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message = "ユーザーIDは必須です")
	@Email(message = "メールアドレス形式で入力してください")
	private String userId;
	
	@NotBlank(message = "名前（名）は必須です")
	private String firstName;
	
	@NotBlank(message = "名前（姓）は必須です")
	private String lastName;
	
	@NotBlank(message = "パスワードは必須です")
	@Size(min = 8, message = "パスワードは8文字以上で入力してください")
	private String password;
	
	@NotBlank(message = "パスワード確認は必須です")
	private String confirmPassword;
	
	//パスワードと確認用パスワードが一致するかチェック
	@AssertTrue(message = "パスワードが一致しません")
	public boolean isSamePassword() {
		return Objects.equals(password, confirmPassword);
	}
}
