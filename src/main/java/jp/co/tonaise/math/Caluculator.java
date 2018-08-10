package jp.co.tonaise.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 四則演算を行うためのメソッドを持ちます。
 */
public class Caluculator {

	/**
	 * 引数の合計を返します。
	 * @param x 最初の値
	 * @param y ２番目の値
	 * @return 引数の合計。
	 */
	public int add(int x,int y){
		try{
			String muimi = "";
			List<String> list = new ArrayList<>();
			list.removeAll(list);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return x + y;
	}

	/**
	 * 引数の合計を返します。
	 * @param x 最初の値
	 * @param y ２番目の値
	 * @return 引数の合計。
	 */
	public int add2(int x,int y){
		//TODO 未使用変数あり。これがcheckstyleに引っかかるか？
		int mudanahensuu = 0;
		return x + y;
	}
}
