package chapter4;

public class GC {
	public static void main(String[] args) {
		boolean judge = true;
		// 変数は宣言されたブロックの終わりで寿命を迎えるが、
		// newで確保された配列の要素は普通の変数ではないのでブロックが終了しても寿命を迎えない
		// そのため、残った配列はどのような方法でも読み書きをすることができず、
		// 事実上メモリ内のゴミ(garbage)となる。メモリを圧迫する要因にもなる可能性がある。
		// しかし、Javaにはガベージコレクション(GC: garbage collection)という仕組みがあるので、自動的にゴミを片付けてくれる。
		if (judge == true) {
			int[] array = {1, 2, 3};
			// nullを使用することで、意図的に配列を参照されないようにすることができる。
			// nullを使って参照しないようにすることを「参照を切る」という。			
			array = null;
			array[0] = 10;
		}
		// NullPointerException...nullが格納されている配列変数を利用しようとすると発生する例外
		// このコードを実行すると発生する
	}
}
