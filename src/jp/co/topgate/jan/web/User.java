package jp.co.topgate.jan.web;

import java.io.Serializable;
/**
 * クライアント名とパスワードを保管するモデル
 * @author aizijiang.aerken
 *
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name; // ユーザー名
	private String pass; // パスワード

	public User() {
	}

	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}
}