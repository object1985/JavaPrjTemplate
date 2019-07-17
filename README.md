# 概要
mvn site実行のためのサンプルとしてJavaソースコード、テストコードが配置されています。  
また後述する `mvn clean jacoco:prepare-agent site jacoco:report` で[Checkstyle,jUnit4,Javadoc,FindBugs,jacoco(Coverage)]のレポート出力が可能です。  
Javaソースコード、テストコードは[Checkstyle,jUnit4,Javadoc,FindBugs,jacoco]を出力するためのサンプルです。不要ですので削除してください。

# 検証環境

```
JavaPrjTemplate[master ]$ mvn --version
OS:Mac Mojave
eclipse:Neon3(4.6.3)
junit:JUnit4

JavaPrjTemplate[master ]$ mvn --version
Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-25T03:41:47+09:00)
Maven home: /usr/local/Cellar/maven/3.6.0/libexec
Java version: 1.8.0_192, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre
Default locale: ja_JP, platform encoding: UTF-8
OS name: "mac os x", version: "10.14.4", arch: "x86_64", family: "mac"
JavaPrjTemplate[master ]$ 
JavaPrjTemplate[master ]$ java -version
java version "1.8.0_192"
Java(TM) SE Runtime Environment (build 1.8.0_192-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.192-b12, mixed mode)
```

# 本Projectを作成した手順
1. eclipse > 新規MavenProject
2. JavaBuildPath > Libraries > Junit4を追加
3. pom.xmlに[Checkstyle,jUnit4,Javadoc,FindBugs,jacoco]追加。
4. [ルート/]config/checkstyle.xml 追加。
5. gitignore追加
6. 以降メンテナンス

# 特筆
pom.xml のある階層で `mvn site` の実行で以下のレポート出力が可能。

1. `target/site/index.html` を開き[Project Reports]を開く
	1. Checkstyle
	1. Surefire Report(jUnit結果)
	1. Javadoc
	1. Test Javadoc
	1. FindBugs
	1. jacoco
