# 第十三章 総仕上げ問題

## 2
- ジェネリクスを使ったクラスのことを「総称型」と呼ぶ。
- 型パラメータを受け取るクラスに型パラメータを渡さなかった場合、Object型の型パラメータが渡されたものとして解釈される。

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
