package jp.co.topgate.jan.web;

/**
 * クライアントパスワードチェック
 * @author aizijiang.aerken
 *
 */
public class LoginLogic {
	public boolean execute(User user) {
		if (user.getPass().equals("1234")) {
			return true;
		}
		return false;
	}
}