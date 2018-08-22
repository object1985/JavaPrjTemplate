# 概要
サンプルでJavaソースコード、テストコードがあります。  
また後述する `mvn clean jacoco:prepare-agent site jacoco:report` で[Checkstyle,jUnit4,Javadoc,FindBugs,jacoco(Coverage)]のレポート出力が可能です。  
Javaソースコード、テストコードは[Checkstyle,jUnit4,Javadoc,FindBugs,jacoco]を出力するためのサンプルです。不要ですので削除してください。

# 検証環境

```
OS:Mac Sierra
eclipse:Neon3(4.6.3)
junit:JUnit4

$ mvn --version
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-11T01:41:47+09:00)
Maven home: /usr/local/apache-maven-3.3.9
Java version: 1.8.0_65, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/jre
Default locale: ja_JP, platform encoding: UTF-8
OS name: "mac os x", version: "10.12.5", arch: "x86_64", family: "mac"
$ 
$ java -version
java version "1.8.0_65"
Java(TM) SE Runtime Environment (build 1.8.0_65-b17)
Java HotSpot(TM) 64-Bit Server VM (build 25.65-b01, mixed mode)
```

# 本Projectを作成した手順
1. eclipse > 新規MavenProject
1. JavaBuildPath > Libraries > Junit4を追加
1. pom.xmlに[Checkstyle,jUnit4,Javadoc,FindBugs,jacoco]追加。
1. [ルート/]config/checkstyle.xml 追加。
1. gitignore追加

# 特筆
pom.xml のある階層で `mvn site` の実行で以下のレポート出力が可能。

1. `target/site/index.html` を開き[Project Reports]を開く
	1. Checkstyle
	1. Surefire Report(jUnit結果)
	1. Javadoc
	1. Test Javadoc
	1. FindBugs
	1. jacoco
