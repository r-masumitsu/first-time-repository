package com.example.yontaku;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public PasswordEncoder passwordEncoder() {
		// エンコンコードの設定
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
				// ★HTTPリクエストに対するセキュリティ設定
				.authorizeHttpRequests(authz -> authz
						// ログインページ・トップページ・静的リソースは認証不要
						.requestMatchers("/", "/login", "/top", "/css/**", "/js/**", "/images/**").permitAll()
						// その他のリクエストは認証が必要
						.anyRequest().authenticated())
				// ★フォームベースのログイン設定
				.formLogin(form -> form
						// カスタムログインページのURLを指定
						.loginPage("/login")
						// ログイン処理のURLを指定
						.loginProcessingUrl("/authentication")
						// ユーザー名のname属性を指定
						.usernameParameter("usernameInput")
						// パスワードのname属性を指定
						.passwordParameter("passwordInput")
						// ログイン成功時のリダイレクト先を指定
						.defaultSuccessUrl("/home", true)
						// ログイン失敗時のリダイレクト先を指定
						.failureUrl("/login?error=true")
						// ログインページのアクセスを全員に許可
						.permitAll())
				// ★ログアウト設定
				.logout(logout -> logout
						// ログアウト処理のURLを指定
						.logoutUrl("/logout")
						// ログアウト成功時のリダイレクト先を指定
						.logoutSuccessUrl("/login?logout=true")
						// セッション無効化
						.invalidateHttpSession(true)
						// Cookie削除
						.deleteCookies("JSESSIONID")
						// ログアウトページのアクセスを全員に許可
						.permitAll());
		return http.build();
	}
}