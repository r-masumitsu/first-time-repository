# ベースイメージにTomcatを使用
FROM tomcat:9.0

# WARファイルをTomcatのwebappsディレクトリにコピー
COPY /target/UMInoSACHI.war /usr/local/tomcat/webapps/

# Tomcatを起動
CMD ["catalina.sh", "run"]