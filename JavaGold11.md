# 第十三章 総仕上げ問題

## 1
- java.lang.Systemクラスのinフィールドは、キーボードから入力されるデータを扱うためのInputStream型オブジェクトである。
- InputStreamReaderは、InputStream（バイトストリームを扱う）をReader（文字ストリームを扱う）に変換する。
- BufferedReaderを併用することで、読み込み効率化になる。
- BufferedReaderのreadLineメソッドを実行すると、キーボードからの入力をバイトストリームとして受け取り、それを文字ストリームに変換して文字列として戻す。
	→もし、キーボードからの入力がなければ、入力されるまでの間、プログラムは処理を停止して、入力待ちになる。


## 2
- java.nio.file.Filesクラスのlinesメソッド・・・ファイル内のすべての行をStreamとして読み取る。
	- 引数・・・Path
	- 戻り値・・・Stream<String>

- java.nio.file.FilesクラスのreadAllLinesメソッド・・・ファイル内のすべての行を読み取り、Listとして戻す。
	- 引数・・・Path
	- 戻り値・・・List<String>


## 3
- ＜例＞ServiceLoader<Test> loader = ServiceLoader.load(Test.class)

- ServiceLoaderクラスは、java.lang.Iterateインタフェースを実装しているため、拡張for文で処理することができる。
- ⭐︎ServiceLoaderクラスの役割・・・クラスパス上にある、サービスのインタフェースを実装したクラスを探し出し、そのコレクションを扱う。


## 4
- peekメソッドは、ストリーム・パイプラインの途中がどのような状態になっているかを確認する中間操作の一つ。
	- 引数・・・Consumer<T>
	- 戻り値・・・Stream<T>

- forEachメソッドは、ストリーム・パイプラインの終端操作である。Stream の各要素に対して処理を実行して終わる。
	- 引数・・・Consumer<T>
	- 戻り値・・・無し

## 5
### ストリームでよく使われるメソッド
- filterメソッド・・・特定の要素に絞り込む中間操作。
	- 引数・・・Predicate<T>
	- 戻り値・・・Stream<T>
- mapToIntメソッド・・・T型をintに変換する
	- 引数・・・ToIntFunction<T>
	- 戻り値・・・IntStream
- averageメソッド・・・平均を求める。IntStream・LongStream・DoubleStreamに定義されている。
	- 引数・・・なし
	- 戻り値・・・OptionalDouble
- ＜例＞OptionalDoubleから値を取り出す。
	- double value = avg.getAsDouble(); // 値がないと例外になるので非推奨
	- double value = avg.orElse(0.0); // 安全な書き方（推奨）

### CollectorsクラスのgroupingByメソッドはいくつかのオーバーロードを持っている
- List<Item>を、name（名前）ごとにグループ化して、price（価格）の平均値を求める
- ＜誤り例＞
```java
double result =	//戻り値はdoubleではない
    list.stream()
        .collect(Collectors.groupingBy(
            Item::getName,
            Collectors.averagingDouble(Item::getPrice)
        ));
- ＜正しい例＞
```java
Map<String, Double> result =
    list.stream()
        .collect(Collectors.groupingBy(
            Item::getName,
            Collectors.averagingDouble(Item::getPrice)
        ));
