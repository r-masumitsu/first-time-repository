# ベースイメージとしてJava 21を指定
FROM openjdk:21-jdk

# 作業ディレクトリを作成
WORKDIR /app

# ソースコードをコンテナ内にコピー
COPY . /app

# findutils パッケージをインストールし、find コマンドを使用できるようにする
RUN microdnf install findutils

# 依存関係をインストールして、JARをビルド
RUN ./gradlew build -x test

# ビルドされたJARファイルを実行する
CMD ["java", "-jar", "/app/build/libs/galaxy-0.0.1-SNAPSHOT.jar"]