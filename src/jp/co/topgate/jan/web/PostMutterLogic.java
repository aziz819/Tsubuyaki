package jp.co.topgate.jan.web;

import java.util.List;
/**
 * クライアントに入力したコンテキストをリストに追加
 * @author aizijiang.aerken
 *
 */
public class PostMutterLogic {
	public void execute(Mutter mutter, List<Mutter> mutterList) {
		mutterList.add(0, mutter); // 先頭に追加 解説①
	}
}