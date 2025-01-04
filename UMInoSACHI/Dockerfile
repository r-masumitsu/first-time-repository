# ベースイメージにTomcatを使用
FROM tomcat:10.1

# WARファイルをTomcatのwebappsディレクトリにコピー
COPY /target/UMInoSACHI.war /usr/local/tomcat/webapps/ROOT.war

# Tomcatを起動
CMD ["catalina.sh", "run"]