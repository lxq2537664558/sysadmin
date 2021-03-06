package com.matete.agentmanage.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRoomcard<M extends BaseRoomcard<M>> extends Model<M> implements IBean {

	public M setGameID(java.lang.Integer GameID) {
		set("GameID", GameID);
		return (M)this;
	}

	public java.lang.Integer getGameID() {
		return get("GameID");
	}

	public M setScore(java.lang.Integer Score) {
		set("Score", Score);
		return (M)this;
	}

	public java.lang.Integer getScore() {
		return get("Score");
	}

	public M setWins(java.lang.Integer Wins) {
		set("Wins", Wins);
		return (M)this;
	}

	public java.lang.Integer getWins() {
		return get("Wins");
	}

	public M setFields(java.lang.Integer Fields) {
		set("Fields", Fields);
		return (M)this;
	}

	public java.lang.Integer getFields() {
		return get("Fields");
	}

	public M setEscape(java.lang.Integer Escape) {
		set("Escape", Escape);
		return (M)this;
	}

	public java.lang.Integer getEscape() {
		return get("Escape");
	}

	public M setGameTime(java.lang.String GameTime) {
		set("GameTime", GameTime);
		return (M)this;
	}

	public java.lang.String getGameTime() {
		return get("GameTime");
	}

	public M setGameCount(java.lang.Integer GameCount) {
		set("GameCount", GameCount);
		return (M)this;
	}

	public java.lang.Integer getGameCount() {
		return get("GameCount");
	}

	public M setOnlinGameTime(java.lang.Integer OnlinGameTime) {
		set("OnlinGameTime", OnlinGameTime);
		return (M)this;
	}

	public java.lang.Integer getOnlinGameTime() {
		return get("OnlinGameTime");
	}

	public M setGold(java.lang.Integer gold) {
		set("gold", gold);
		return (M)this;
	}

	public java.lang.Integer getGold() {
		return get("gold");
	}

	public M setAccount(java.lang.String account) {
		set("account", account);
		return (M)this;
	}

	public java.lang.String getAccount() {
		return get("account");
	}

}
