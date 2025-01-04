# ビルドステージ
FROM gradle:7.6-jdk17 AS builder
WORKDIR /app

# プロジェクト全体をコンテナ内にコピー
COPY . .

# Gradleを使ってWARファイルをビルド
RUN gradle clean build

# 実行ステージ
FROM tomcat:9.0
WORKDIR /usr/local/tomcat/webapps/

# ビルドしたWARファイルをTomcatのwebappsフォルダに配置
COPY --from=builder /app/build/libs/*.war ./your-app-name.war

# Tomcatを起動する
CMD ["catalina.sh", "run"]