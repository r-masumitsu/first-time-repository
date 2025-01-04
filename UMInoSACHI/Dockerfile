# ベースイメージにTomcatを使用
FROM tomcat:10.1

# WARファイルをTomcatのwebappsディレクトリにコピー
COPY /target/UMInoSACHI.war /usr/local/tomcat/webapps/

# Tomcatを起動
CMD ["catalina.sh", "run"]