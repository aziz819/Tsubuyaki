package jp.co.topgate.jan.web;

import java.io.Serializable;
/**
 * クライアント名とつぶやきをを保管するモデル
 * @author aizijiang.aerken
 *
 */
public class Mutter implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userName; // ユーザー名
	private String text; // つぶやき内容

	public Mutter() {
	}

	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
	}

	public String getUserName() {
		return userName;
	}

	public String getText() {
		return text;
	}
}