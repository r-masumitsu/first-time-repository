# 第一章 コレクションとジェネリクス

## 2
- ジェネリクスを使ったクラスのことを「総称型」と呼ぶ。
- 型パラメータを受け取るクラスに型パラメータを渡さなかった場合、Object型の型パラメータが渡されたものとして解釈される。

## 3
### ジェネリクスの型推論が使える箇所
- 変数への代入
- メソッドの戻り値
- メソッド呼び出しの引数

### ジェネリクスの型推論が使えない箇所
- クラス宣言

## 4
- サブクラス型の代入を許す「共変性」
- サブクラス型の代入を許さない「非変性」
- さらにスーパークラス型の代入を許す「反変性」
- ジェネリクスは非変

## 8
- 上限境界ワイルドカード（`? extends T`）・・・読み取り専用

## 9
- 下限境界ワイルドカード（`? super T`）・・・書き込み専用

## 10
- ArrayListは、読み込みは速いが、書き込みは遅い
- LinkedListは、書き込みは速いが、読み込みは遅い
- Vectorは、マルチスレッドに対応しているが、パフォーマンスは悪い

## 11
- `java.util.Set`は、重複する要素を持たないことを保証するコレクションの機能を定義したインタフェース

## 15
- `Map.Entry`インタフェース・・・マップ内のペアを扱う
- Mapから`Map.Entry`を取得するには、`entrySet`メソッドを使う

## 16
- `java.lang.Comparable`を実装したクラスは`compareTo`を実装しなければならない。次のルールに基づいて実装する。
  - 自分自身が相手よりも前に位置する → 負の整数を返す
  - 自分自身が相手よりも後ろに位置する → 正の整数を返す
  - 相手と同値で並べ替え不要 → 0を返す

## 17
- `Comparator`の`compare`メソッドは引数を2つ受け取る


# 第二章 関数型インタフェースとラムダ式

## 3
- メソッド内で宣言したローカル変数と同じ名前の変数をラムダ式の引数名として使うことはできない。

## 4
- ラムダ式外で宣言されたローカル変数にラムダ式内からアクセスするには、実質的にfinalな変数でなければいけない。


# 第三章 JavaストリームAPI

## 2
- getメソッドは、値が入っていることを前提としているため、getメソッドで空の`Optional`のインスタンスから値を取り出そうとすると、`NoSuchElementException`がスローされる。

## 11
- 配列からストリームを作るには`java.util.Arrays`クラスの`stream`メソッドを使う。

## 16
- findFirstメソッドはストリームの最初の要素を戻すものであって、最初に処理した要素を戻すわけではない。


# 第四章 Javaモジュールシステム

## 3
### [構文]モジュールのクラスを実行
- java --module-path モジュールのルートディレクトリ -m 実行したいモジュールのクラス
- モジュールに含まれるクラスを実行するには、モジュール名と実行したいクラスの完全修飾名クラス名をスラッシュ「/」で区切る。

### [構文]モジュールを一つにまとめるコマンド
- jar --create --file=jarファイル名 --main-class=エントリーポイントを持つクラス -C jarファイルに含めるファイルがあるディレクトリ

## 7
### [構文]module-info.javaでexportされていないパッケージを一時的に利用してコンパイルする
- javac -d コンパイル先ディレクトリ --module-path モジュールのルートディレクトリ -add-exports 対象のモジュール/公開するパッケージ=利用するモジュール コンパイルするjavaファイル

## 8
### そのモジュールがどのようなパッケージを公開しているのか、またどのようなモジュールに依存しているか、module-info.java以外で確認するには次のような方法がある。
- javaコマンドの--describe-moduleオプションを使う。
- jmodコマンドのdescribeモードを使う。

- jdepコマンドは、クラスやメソッド、jarファイル、モジュールの依存関係を調べるためのコマンドである
- javaコマンドの--show-module-resolutionオプションは、プログラムの実行時に依存するモジュールがどのように探されているかを表示するためのオプション。

## 12
- モジュール内の特定のクラスを実行したい場合は、--moduleオプションに「モジュール名/完全修飾クラス名」の書式で、実行したいクラスを指定する。

## 15
### jdepsコマンドのオプション
- -jdkinternalsオプションは、JDKの内部APIでクラスレベルの依存関係を検索する。
- -verbose:classオプションは、クラスレベルの依存関係を検索する。
- -apionlyオプションは、分析対象はpublicなクラスのpublicもしくはprotectedなメンバに制限するもの。
- -profileオプションは、依存するプロファイルを検索するためのもの。


# 第五章 並列処理

## 12
- volatile修飾子は、変数に対して「この値の読み書きは、すべてのスレッドから常に最新のものが見えるようにする」という保証を与える。

## 13
### Javaのインスタンス生成手順
- 1.メモリを確保する
- 2.インスタンスの参照を変数に代入する
- 3.コンストラクタを呼んでインスタンスを初期化する

## 17
- scheduleAtFixedRateメソッドは、インターバルが終了したら次の処理を実行する。次の処理との間隔は一定ではない。
- scheduleWithFixedDelayメソッドは、処理時間の長さに関係なく一定のインターバルを取る。


# 第六章 ファイルI/O

## 12
- ファイルやディレクトリへのパスを表すのは、java.nio.file.Pathインタフェース
- ファイル操作は、java.nio.file.Filesクラス
- Pathのインスタンスへの参照を取得するのは、java.nio.file.Pathsクラスのgetメソッド
- Pathのインスタンスへの参照を取得するのは、new File("sample.txt").toPath()でも可能


# 第七章 JDBC

## 10
- PreparedStatementのexecuteUpdateメソッドの引数にSQL文を渡してもコンパイルエラーにはならない。ただし、例外がスローされる。

## 11
- ResultSetのgetXXXメソッドの引数は、列番号をint型で渡すか、列名をString型で指定する。なお、列番号は1から始まる点に注意。


# 第八章 ローカライズ

## 6
- Properties#loadメソッドには、java.io.InputStreamを引数として渡す。


# 第九章 模擬問題

## 14 リストのソート方法主に三つ
- Collections.sort（一番シンプル）
```java
Collections.sort(list);
```
- Listのsortメソッド（Java8以降）
```java
list.sort(Comparator.naturalOrder());
```
- Streamでソート（新しいListを作る）
```java
List<String> sorted = list.stream()
					.sorted()
					.collect(Collectors.toList());
```

## 16 Console.printf は「フォーマット付きで出力する」ためのメソッド
- 指定子%s・・・文字列
- 指定子%d・・・整数
- 指定子%f・・・少数
- 指定子%n・・・改行
```java
Console console = System.console();
console.printf("名前：%s 年齢：%d%n", "太郎", 20);
```
- 違う種類の指定子を使ってしまうと、 IllegalFormatConversionExceptionが発生する。

## 18 複数のListの中にある数値を全部まとめて、平均値を計算している
```java
double avg = Stream.of(a, b)
	.flatMap(List::stream)
	.collect(Collectors.averagingDouble(d -> d));
```
- IntStream#averageメソッドの戻り値型はOptionalDouble型である。
- averageメソッドは、IntStreamに対して提供されるメソッドであり、mapToIntメソッドなどによる型変換がなければ使用できません。

## 22 
- IntStream#allMatchメソッドとIntStream#noneMatchメソッドとはいずれもストリームの終端操作である。

## 23 java.time.format.DateTimeFormatterで使用される日付・時刻パターン文字列について
- パターン文字列で元号を表すにはGを使う。1〜3回のGは略称、4回のGは元号の完全な名称、5回のGはナロースタイル（1文字）を表す。
- パターン文字列で曜日を表すにはEを使う。1〜3回は略称、4回はの完全な名称である。

## 26
- 同一のThreadインスタンスに対するstartは1回しか許されない。2回目はIllegalThreadStateExceptionがスローされる。

## 28
- FileOutputStreamは文字単位ではなくバイト単位で書き込むクラスである。writeメソッドにはバイト文字列を渡す必要がある。

## 31
- ストリーム内の数値の平均を計算できるのは、IntStream,LongStream,DoubleStreamといったプリミティブ専用ストリームだけである。

## 34
- Flow.Subscriberでは、受付開始時にどれだけの要素を受け取るかをrequestメソッドで指定する。ここに0以下の値を渡すことは仕様違反と定められている。

## 39
### outディレクトリにあるモジュール（moda）とその依存関係をもとに、必要最小限の軽量なJava実行環境をruntimeに生成し、指定したメインクラス（app.moda.Main）を起動するコマンド（main）も作成するコマンド。
jlink -p out --add-modules moda --output runtime --launcher main=moda/app.moda.Main

## 42
### src配下のmoduleaを、依存モジュール（../out）を参照しながらコンパイルして、outに出力するコマンド
javac -d out --module-source-path src --module-path ../out --module modulea

## 50
- Stream#takeWhileメソッド・・・ストリームの先頭から条件がtrueの間だけ要素を取り出す操作である。
