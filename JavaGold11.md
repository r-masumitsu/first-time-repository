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
#### List<Item>を、name（名前）ごとにグループ化して、price（価格）の平均値を求める
##### ＜誤り例＞
```java
double result =	//戻り値はdoubleではない
    list.stream()
        .collect(Collectors.groupingBy(
            Item::getName,
            Collectors.averagingDouble(Item::getPrice)
        ));
```
##### ＜正しい例＞
```java
Map<String, Double> result =
    list.stream()
        .collect(Collectors.groupingBy(
            Item::getName,
            Collectors.averagingDouble(Item::getPrice)
        ));
```

## 7
- ボクシングやアンボクシングができるのは、ラッパークラス型とプリミティブ型の間だけである。

## 8
- クラスが定義するメソッドと、インタフェースのデフォルトメソッドが重複した場合、クラスに定義されたメソッドが優先される。このルールはコンパイル時ではなく、実行時に適用される。

## 10
- try-with-resourcesにて、tryブロック内とcloseメソッドの両方で例外が発生した場合は、closeの例外はtryの例外に隠される。

## 12
###変数をスレッドセーフにする方法二つ。
- synchronizedを使って排他制御を行う。
- AtomicIntegerなどの、マルチスレッドに対応可能なプリミティブ型のラッパークラスを利用する。

## 13
### FormatStyleの列挙子による日付の書式（2021年4月1日の例）
- FULL   → Thursday, April 1, 2021
- LONG   → April 1, 2021
- MEDIUM → Apr 1, 2021
- SHORT  → 4/1/21

## 14
- java.sql.StatementインタフェースのenquoteIdentifierメソッドを使うことで、SQLに与える値を引用符で囲むことができる。SQLインジェクションを防ぐ一定の効果がある。
- SQL文のリテラルは、文字列や日付は引用符で囲む必要があるが、数値を囲む必要はない。

## 15
- java.lang.AutoCloseableインタフェースには、closeメソッドだけが定義されており、try-with-resourcesで自動的にリソースを閉じるときの処理を実装する。

## 21
- java.util.OptionalクラスのifPresentメソッド・・・結果が存在すれば、渡されたConsumer型の処理を実行する。結果が存在しなければ何もしない。

## 23
- java.util.Streamインタフェースのofメソッドは、配列を元に、ストリームを作る。

## 24
- カプセル化はあくまでも、責務の明確なモジュール（部品）を定義するために行うもので、セキュアコーディングと直接的な関係ない。

## 25
- 列挙型のコンストラクタのアクセス修飾子は、privateでなくてはいけない。publicにしておくと、プログラマーが自由にインスタンスを生成するコードを記述できるようになり、規定の列挙子以外を使えるようになってしまうから。

## 26
- インタフェースに定義できるのは、public、もしくはprivateなメソッドだけである。
- インタフェースには、オーバーライドできないメソッドは定義できない。

## 29
- throws句では実際にその例外がスローされるかどうかまではチェックされない。
- あくまでも利用している側にtry-catchなどの例外処理を促すのがthrowsの目的である。

## 30
- java.nio.file.Pathsクラスのgetメソッドは、指定したファイルが存在しなくても、「存在しないパスを表すpathオブジェクト」を戻す。存在チェックは行わない。

## 31
- SPIを実装するモジュールは、SPIの拡張ポイントとしてのインタフェースを参照する必要がある。
	- 実装モジュールはSampleモジュールを利用できるように、そのモジュール定義ファイルに「requires Sample;」というディレクティブを含める必要がある。
- SPIの拡張ポイントとなるインタフェースが変わらない限り、SPIを利用する側のモジュールを再コンパイルする必要はなく、独立してコンパイルすることができる。

## 32
- java.util.stream.StreamインタフェースのmapToXXXメソッドはストリームをそれぞれプリミティブ型のデータを扱うストリームに変換する。
- 変換できるのは、IntStream,DoubleStream,LongStream
- StreamとIntStream,DoubleStream,LongStreamは、共にBaseStreamインタフェースを継承するサブインタフェースであって、互換性はない。

## 34
###ArrayListの、要素を追加するメソッド
- addメソッド・・・要素を末尾に追加する。
- setメソッド・・・任意の場所の要素を置き換える。第一引数に「位置」、第二引数に「置き換える要素」。存在しない位置の要素を置き換えようとすると、java.lang.IndexOutOfBoundsExceptionがスローされる。

## 35
- 利用したリソースは、Dos攻撃を防ぐためにも、利用終了と同時に閉じなければいけない。

## 36
- java.util.Listインタフェースに定義されている、List型のインスタンスへの参照を戻すstaticメソッドは、すべて「変更不可能なリスト」を生成して戻す。
	- addメソッドなどを使って要素を追加しようとすると、java.lang.UnsupportedOperationExceptionがスローされる。

## 37
- 列挙型のvaluesメソッドは、列挙型が持っている列挙子（定数）の配列を戻す。
- java.lang.StringクラスのvalueOfメソッドは、受け取った参照が持つtoStringメソッドを呼び出す。
	- intなどを引数に取るオーバーロードされたメソッドが用意されている。直接String化される。

## 38
- FloatとDoubleの間に継承関係はない。

## 39
- synchronizedブロックによる排他処理は、メソッド単位で行われるため、複数のメソッドをまたぐような排他処理は実現できない。
	- このような場合には、java.util.concurrent.locks.ReentrantLockクラスを利用する。
		- lockメソッドで明示的にロックを獲得し、unlockメソッドで解除するまでの間、排他処理を実現する。

- ReentrantLockクラスのコンストラクタはオーバーロードされており、boolean型の引数を受け取るものが用意されている。
	- この引数によって、ロックの取得順序の公平・不公平のポリシーを選択するおことができる。
	- 公平であれば、ロック待ちのスレッドから順番にロックを取得していく。
	- 不公平であれば、ロックの取得については順番が決まっておらず、その時の状態によってロックの取得順が異なる。

## 40
- PreparedStatementにセットしたパラメータは、SQLの実行後も残る。
- 一度セットしたパラメータを変更する方法二つ
	- StatementクラスのclearParametersメソッドを使ってパラメータをすべてクリアする。
	- setXXXメソッドを使って任意の場所のパラメータを上書きする。

## 41
- 接続文字列の書式
	- jdbc:DBMS名://<サーバーのIPアドレス>:<ポート番号>/データベースの場所

## 44
- ジェネリクスを利用するときにボクシングは使えない。
- ラムダ式で変数のデータ型を宣言するには、データ型と変数名をカッコ「（）」で囲まなければならない。


## 45
- java.util.stream.IntStreamインタフェース
- generateメソッド・・・引数のラムダ式が戻す値を含むランダムな整数のストリームを生成する。
	- 引数・・・IntSupplier
	- 戻り値・・・IntStream
- java.util.RandomクラスのnextIntメソッドは、staticメソッドではなく、インスタンスメソッドである。

## 46
- java.util.stream.CollectorsクラスのaveragingDoubleメソッドは、ストリームの要素をdouble型に変換し、平均を求めることができる。
```java
double a = list.stream().collect(Collectors.averagingDouble(n -> n));
```
### java.util.stream.IntStreamインタフェース
- averageメソッド・・・このストリームの要素の算術平均を記述するOptionalDoubleを返す。
	- 引数・・・無し
	- 戻り値・・・OptionalDouble
### java.util.stream.Streamインタフェース
- mapToIntメソッド・・・このストリームの要素に、指定された関数を適用した結果から構成されるIntStreamを返す。
	- 引数・・・ToIntFunction<T>
	- 戻り値・・・IntStream

## 47
### java.util.stream.Streamインタフェース
- anyMatchメソッド・・・このストリーム内のいずれかの要素が引数に一致するかどうかをboolean型で戻す。
	- 引数・・・Predicate<T>
	- 戻り値・・・boolean
- filterメソッド・・・このストリームの要素のうち、指定された述語に一致するものから構成されるストリームを返す。中間操作である。
	- 引数・・・Predicate<T>
	- 戻り値・・・Stream<T>
- findAnyメソッド・・・ストリームの一部の要素を記述するOptionalを返す。ストリームが空の場合は空のOptionalを返す。
	- 引数・・・無し
	- 戻り値・・・Optional<T>

## 48
### java.util.Comparatorインタフェース
- comparingメソッド・・・並べ替えで利用するキーを受け取り、そのキーを使って並べ替えるComparator型オブジェクトを戻す。
- thenComparingメソッド・・・直前のcomparingメソッドが比較対象の二つが等しいと判断した場合、追加の条件で並べ替えるComparator型のオブジェクトを戻す。
- reversedメソッド・・・比較条件に従って並び替えたものを反転する。

## 50
### java.util.streamパッケージのStreamインタフェースやIntStreamインタフェースなどのiterableメソッド
- 第１引数に初期値、第２引数に初期値に対して何らかの演算を行うUnaryOperator型のラムダ式を渡すことで、初期値から始まる無限に続くストリームを構築できる。
- limitメソッド・・・ストリーム内の要素を引数の数分に限定する。
- mapToObjメソッド・・・文字列のストリームに変換。

## 52
- staticインナークラスは、エンクロージングクラスのインスタンスを生成しなくても、直接インスタンス化できる。

## 53
### ストリーム内の要素を使って数値の合計を算出する方法２つ
- reduceメソッドを使って累積値を求める
- sumメソッドを使って合計値を求める

- mapメソッドはFunction型のラムダ式を受け取る。

## reduceメソッドのオーバーロード２つ覚えておく
- Optional<T> reduce​(BinaryOperator<T> accumulator)
- T reduce​(T identity, BinaryOperator<T> accumulator)・・・第一引数に戻り値として利用したい型のデータを渡す。

- OptionalクラスのifPresentメソッドは戻り値を戻さない。

- BinaryOperatorを受け取り、累積値を求めるreduceメソッドは、java.lang.stream.Streamインタフェースのメソッドで、IntStreamのインタフェースには存在しない。

## 54
・ラムダ式のアロー演算子の先には、処理ブロックを記述する。メソッド参照を記述することはできない。

・Consumer型はジェネリクスの型パラメータを受け取る。
・型パラメータを渡さなかった場合には、受け取る引数はObject型として解釈されるので、String型の引数を受け取ることはできない。
```java
//↓コンパイルエラー 
Consumer b = (String msg) -> System.out.print(msg);
//↓コンパイル成功
Consumer<String> b = msg -> System.out.print(msg);
```

## 55
- java.time.format.DateTimeFormatterクラスのofPatternメソッドは、日付の書式を表すパターンを文字列として受け取る。
- パターン文字の間に入る「年」「月」「日」などがパターン文字ではないことを示すためには、シングルクォーテーションで囲む。
- 「日」を表すには、「d」を使う。dの数は、表示する最小の桁数を表す。

## 56
- switch文の条件に列挙型を指定した場合、case式には列挙子を記述する。


## 57
### java.util.LocaleクラスのsetDefaultメソッドには、オーバーロードされたメソッドが２つある。
- Localeの参照を受け取る。
```java
//デフォルトロケールを日本に設定
Locale.setDefault(Locale.JAPAN);
```
- Localeのカテゴリを指定して、Localeの参照を受け取る。
```java
// 表示用のロケールをアメリカに設定
Locale.setDefault(Locale.Category.DISPLAY, Locale.US);
// 書式用のロケールをフランスに設定
Locale.setDefault(Locale.Category.FORMAT, Locale.FRANCE);
```

## 58
- java.lang.Systemクラスのinフィールドは、標準入力を扱うInputStream型のstaticなフィールドである。JVMが開始した時点で開かれる。
- java.lang.Systemクラスのoutフィールドは、PrintStream型のstaticなフィールドである。JVMが開始した時点で開かれる。
- SystemクラスのsetInメソッドを使えば、ストリームを置き換えることができる。

## 59
- parallelStreamメソッドを使っていることから、並列ストリームを作っていることが分かる。
- 並列ストリームの処理順はプログラムで制御することはできない。
- 順番を維持したい場合は、forEachメソッドではなく、forEachOrderedメソッドを使う。

## 67
- Object型配列型変数に、String型配列型のオブジェクトは代入できる。→Javaの配列は共変という仕様だから。
- String[]はObject[]のサブタイプである。
```java
Object[] objs;
String[] strs = { "A", "B" };
objs = strs; // OK（コンパイルも通る）
```

## 69
- ダイヤモンド演算子は、インスタンス生成時の型パラメータを省略するもの。変数宣言で使うことはできない。
- 宣言した変数のジェネリクスが型パラメータを持たなかった場合は参照する情報がないため、java.lang.Object型を型パラメータに使うものと見なされる。

## 70
### セキュアなオブジェクトを設計するにあたっては、普遍オブジェクトを定義する。
- フィールドを保護するためにアクセス修飾子privateにする。
- 設定した値が変更されないことを保証するために、finalで修飾する。
- フィールドの値を変更するメソッドは、変更後の新しい値を持った新しいインスタンスを生成して戻すようにする。
- フィールドの値をコピーして戻すgetterメソッドなどは、フィールドのコピーを作り、その参照を戻す。
- 不変オブジェクトの初期化を行うコンストラクタでは、受け取った引数をそのまま利用しない。clone()の結果を代入するようにする。

## 71
### インスタンスのどのフィールドをシリアライズに含めるかを制御する方法２つ。
- 機密情報を扱うフィールドにtransientをつける。
	- transientを指定することによって、フィールドの値は出力されなくなる。
- serialPersistentFieldsフィールドを定義して、シリアライズされるべきフィールドを指定し、機密情報を含むフィールドを除外する。
- シリアライズ・プロキシ・パターンを利用した場合、writeReplaceメソッドとreadResolveメソッドはセットで定義しなければいけない。

## 72
- java.util.stream.Streamインタフェースのcollectメソッドは、ストリーム内の要素の集合を戻す可変リダクション処理を実行するためのもの。
- java.util.stream.Streamインタフェースのcollectメソッドには、２つのオーバーロードがある。コレクションを受け取るオーバーロードは存在しない。
```java
// ① Collector を使う（一般的・推奨）
<R, A> R collect(Collector<? super T, A, R> collector)

// ② 3引数版（低レベル・理解用）
<R> R collect(
    Supplier<R> supplier,
    BiConsumer<R, ? super T> accumulator,
    BiConsumer<R, R> combiner
)
```

## 75
###java.util.stream.IntStreamインタフェースのrangeメソッドは、整数のストリームを構築するメソッド
- 第１引数に「どの値から開始するか」という初期値を渡す。
- 第２引数に上限となる値を渡す。

## 76
- すべてのフィールドで書き出しや復元をしないのであれば、シリアライズはwriteObjectメソッドで、デシリアライズはreadObjectメソッドで、書き込みや読み込みを行う。
- デフォルトの仕組み任せにせず、自分で“どのフィールドを保存するか／復元するか”を決めたいときは、writeObjectとreadObjectを自分で書く
- これらのメソッドが呼び出されるのは、シリアライズやデシリアライズの前のタイミングである。

## 78
- java.util.function.ConsumerインタフェースのandThenメソッドはConsumerオブジェクトを合成し、連続した処理を行う。

## 80
- AllPermissionは、「すべての権限を許可する」過剰な権限である。
- セキュリティの基本の考え方は、すべて拒否して、許可するものだけを設定する「ホワイトリスト形式」が基本。
