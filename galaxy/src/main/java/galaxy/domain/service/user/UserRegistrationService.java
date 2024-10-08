package galaxy.domain.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import galaxy.domain.model.RoleName;
import galaxy.domain.model.User;
import galaxy.domain.repository.user.UserRepository;

@Service
public class UserRegistrationService {
	@Autowired
	UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    // 新しいユーザーを登録
    @Transactional
    public void registerUser(User user, String confirmPassword) throws IllegalArgumentException {
        // 二重登録のチェック
        if (userRepository.findById(user.getUserId()).isPresent())  {
        	throw new IllegalArgumentException("ユーザ名が既に存在します。");
        }

        // パスワードをBCryptでエンコード
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        
        //権限(USER)を設定
        user.setRoleName(RoleName.USER);
        
        // ユーザー情報をデータベースに保存
        userRepository.save(user);
    }
}