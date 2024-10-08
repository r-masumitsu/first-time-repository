# ベースイメージとしてJava 21を指定
FROM openjdk:21-jdk

# 作業ディレクトリを作成
WORKDIR /app

# 実行可能JARファイルを作業ディレクトリにコピー
COPY build/libs/galaxy-0.0.1-SNAPSHOT.jar /app/galaxy.jar

# アプリケーションを実行するコマンド
CMD ["java", "-jar", "/app/galaxy.jar"]